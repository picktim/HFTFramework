package com.lambda.investing.trading_engine_connector;

import com.lambda.investing.Configuration;
import com.lambda.investing.algorithmic_trading.utils.AppUtils;
import com.lambda.investing.backtest_engine.BacktestConfiguration;
import com.lambda.investing.market_data_connector.parquet_file_reader.ParquetFileConfiguration;
import com.lambda.investing.market_data_connector.parquet_file_reader.ParquetMarketDataConnectorPublisher;
import org.apache.hadoop.fs.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static com.lambda.investing.model.Util.fromJsonString;
import static com.lambda.investing.model.Util.toJsonString;

public class App {

    protected final ApplicationContext ac;
    protected Logger logger;

    public static void main(String[] args) {
        try {
            System.setProperty("user.timezone", "GMT");
            new App(args);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(-1);
        }
    }

    private static BacktestConfiguration loadJson(String[] args, Logger logger) {
        String jsonString = args[0];
        BacktestConfiguration inputConfiguration = fromJsonString(args[0], BacktestConfiguration.class);

        System.out.println("-----");
        System.out.println(args[0]);
        System.out.println("-----");
        logger.info("----");
        logger.info("{}", toJsonString(inputConfiguration));
        logger.info("----");
        return inputConfiguration;
    }

    private BacktestConfiguration readFromArgs(String[] args) {
        boolean checkFile = true;
        if (args.length == 0) {
            System.out.println("EXAMPLE json!");
            String exampleJson = "{\"startDate\": \"20201208\", \"endDate\": \"20201208\", \"instrument\": \"btcusdt_binance\"}";
            args = new String[]{exampleJson};
            checkFile = false;
        }

        if (checkFile) {
            File file = new File(args[0]);
            if (!file.exists()) {
                System.err.print("need valid a json file path as input argument to load backtest configuration "
                        + args[0]);
                System.exit(-1);
            }

            try {
                String content = new String(Files.readAllBytes(Paths.get(args[0])));
                args[0] = content;
            } catch (IOException e) {
                System.err.print("need valid a json file path as input argument to load backtest configuration "
                        + args[0]);
                System.exit(-1);
            }
        }

        BacktestConfiguration backtestConfiguration = loadJson(args, logger);
        return backtestConfiguration;
    }

    protected App(String[] args) {

        try {
            ac = new ClassPathXmlApplicationContext(new String[]{"classpath:beans.xml"});
            logger = LogManager.getLogger();
            BacktestConfiguration backtestConfiguration = readFromArgs(args);

            int speed = -1;
            long initialSleepSeconds = 3;
            ParquetFileConfiguration parquetFileConfiguration = new ParquetFileConfiguration(
                    backtestConfiguration.getInstruments(),
                    speed,
                    initialSleepSeconds,
                    backtestConfiguration.getStartTime(),
                    backtestConfiguration.getEndTime());
            //configure it Better!


        } catch (BeansException be) {
            logger = LogManager.getLogger();
            logger.fatal("Unable to load Spring application context files", be);
            throw be;
        }

        AppUtils.LogLibraryVersions();
        AppUtils.LogProperties();


    }

}
