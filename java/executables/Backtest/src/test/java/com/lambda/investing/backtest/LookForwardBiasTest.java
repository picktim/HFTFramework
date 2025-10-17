package com.lambda.investing.backtest;

import com.lambda.investing.Configuration;
import com.lambda.investing.algorithmic_trading.Algorithm;
import com.lambda.investing.algorithmic_trading.pnl_calculation.PnlSnapshot;
import com.lambda.investing.backtest_engine.BacktestConfiguration;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.InputStream;

import static com.lambda.investing.model.Util.fromJsonString;

@RunWith(MockitoJUnitRunner.class)
public class LookForwardBiasTest {

    String jsonPath = "test_LookForward.json";
    String lambdaDataPath = "lambda_data";
    String tempDataPath = "temp";

    String backtestConfigurationJson = null;
    InputConfiguration inputConfiguration = null;

    public LookForwardBiasTest() throws Exception {
        InputStream inputStream = Configuration.class.getClassLoader().getResourceAsStream(jsonPath);
        backtestConfigurationJson = new String(inputStream.readAllBytes());
        inputConfiguration = fromJsonString(backtestConfigurationJson, InputConfiguration.class);

        String lambdaDataPathCompletePath = Configuration.class.getClassLoader().getResource(lambdaDataPath).getPath();
        String tempPathCompletePath = Configuration.class.getClassLoader().getResource(tempDataPath).getPath();

        UtilsTest.ConfigureEnvironment(lambdaDataPathCompletePath, tempPathCompletePath);


    }


    //start backtest test
    @Ignore("not working other computers and too slow")
    @Test
    public void testOrdinaryBacktest() {
        UtilsTest.BacktestLauncher backtestLauncher = new UtilsTest.BacktestLauncher(inputConfiguration);
        BacktestConfiguration backtestConfiguration = backtestLauncher.start();

        Assert.assertNotNull(backtestConfiguration);
        Algorithm algorithm = backtestConfiguration.getAlgorithm();
        Assert.assertNotNull(algorithm);

        PnlSnapshot pnlSnapshot = algorithm.getLastPnlSnapshot(backtestConfiguration.getInstruments().get(0).getPrimaryKey());

        Assert.assertNotNull(pnlSnapshot);
        System.out.println(" ----> pnlSnapshot ---->");
        System.out.println("trades: " + pnlSnapshot.getNumberOfTrades());
        System.out.println("totalPnl: " + pnlSnapshot.getTotalPnl());
        System.out.println("unrealizedPnl: " + pnlSnapshot.getUnrealizedPnl());
        System.out.println("position: " + pnlSnapshot.getNetPosition());

        Assert.assertEquals(6, pnlSnapshot.getNumberOfTrades().get(), 3);
        Assert.assertEquals(1.010, pnlSnapshot.getTotalPnl(), 0.005);
        Assert.assertEquals(0.0, pnlSnapshot.getUnrealizedPnl(), 0.005);
        Assert.assertEquals(0.0, pnlSnapshot.getNetPosition(), 0.005);
    }

//    @Ignore("not working other computers and too slow")
//    @Test
//    public void testOrdinaryBacktestSingleMultipleThread() throws Exception {
//
//        InputConfiguration multipleThreadInputConfiguration = (InputConfiguration) inputConfiguration.clone();
//        multipleThreadInputConfiguration.getBacktest().setMultithreadConfiguration("multi");
//
//        UtilsTest.BacktestLauncher backtestLauncher = new UtilsTest.BacktestLauncher(multipleThreadInputConfiguration);
//        BacktestConfiguration backtestConfiguration = backtestLauncher.start();
//
//        Assert.assertNotNull(backtestConfiguration);
//        Algorithm algorithm = backtestConfiguration.getAlgorithm();
//        Assert.assertNotNull(algorithm);
//
//        PnlSnapshot pnlSnapshot = algorithm.getLastPnlSnapshot(backtestConfiguration.getInstruments().get(0).getPrimaryKey());
//        System.out.println(pnlSnapshot);
//        Assert.assertNotNull(pnlSnapshot);
//
//        System.out.println(" ----> pnlSnapshot ---->");
//        System.out.println("trades: " + pnlSnapshot.getNumberOfTrades());
//        System.out.println("totalPnl: " + pnlSnapshot.getTotalPnl());
//        System.out.println("unrealizedPnl: " + pnlSnapshot.getUnrealizedPnl());
//        System.out.println("position: " + pnlSnapshot.getNetPosition());
//
//        //TODO: is not completelly equal...yet
//        Assert.assertEquals(262, pnlSnapshot.getNumberOfTrades().get(), 30);
//        Assert.assertEquals(-0.095, pnlSnapshot.getTotalPnl(), 0.04);
//        Assert.assertEquals(-0.0036, pnlSnapshot.getUnrealizedPnl(), 0.005);
//        Assert.assertEquals(-2E-4, pnlSnapshot.getNetPosition(), 0.005);
//    }

}
