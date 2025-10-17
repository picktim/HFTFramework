package com.lambda.investing.algorithmic_trading.utils;

import com.lambda.investing.algorithmic_trading.Algorithm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AppUtils {
    private static Logger logger = LogManager.getLogger(AppUtils.class);

    public static void LogLibraryVersions() {
        // Log Java version
        String javaVersion = System.getProperty("java.version");
        logger.info("Java Version: {}", javaVersion);

        logger.info("Logging Lambda Investing library versions:");
        Package[] packages = Package.getPackages();
        for (Package pkg : packages) {
            String packageName = pkg.getName();
            if (packageName.startsWith("com.lambda.investing")) {
                String version = pkg.getImplementationVersion();
                logger.info("Lambda Library: {} - Version: {}", packageName,
                        version != null ? version : "unknown");
            }
        }


    }

    public static void LogProperties() {
        logger.info("");

        logger.info("");
        logger.info("JVM arguments: " + ManagementFactory.getRuntimeMXBean().getInputArguments());

        logger.info("");

        logger.info("System environment:");
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            logger.info(entry.getKey() + " -> " + entry.getValue());
        }

        logger.info("");
        logger.info("System properties: ");
        String lastElem;
        String elem;
        List<String> listPropertyValue;
        for (Map.Entry<Object, Object> entry : System.getProperties().entrySet()) {
            elem = entry.getKey().toString();
            listPropertyValue = Arrays.asList(elem.split("\\."));
            lastElem = listPropertyValue.get(listPropertyValue.size() - 1);
            logger.info(entry.getKey() + " -> " + entry.getValue());
        }
        logger.info("");
    }


}
