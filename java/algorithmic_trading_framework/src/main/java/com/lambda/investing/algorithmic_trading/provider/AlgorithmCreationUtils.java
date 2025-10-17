package com.lambda.investing.algorithmic_trading.provider;

import com.lambda.investing.algorithmic_trading.Algorithm;
import com.lambda.investing.algorithmic_trading.AlgorithmConnectorConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.ServiceLoader;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class AlgorithmCreationUtils {
    private final List<AlgorithmProvider> providers;
    private static AlgorithmCreationUtils instance;

    private static volatile Object lockObject = new Object();


    public static AlgorithmCreationUtils getInstance() {
        synchronized (lockObject) {
            if (instance == null) {
                instance = new AlgorithmCreationUtils(new ArrayList<>());
            }
            return instance;
        }
    }


    public void addProvider(AlgorithmProvider provider) {
        providers.add(provider);
    }

    private AlgorithmCreationUtils(List<AlgorithmProvider> providers) {
        this.providers = providers;
    }

    public Algorithm getAlgorithm(String algorithmName, Map<String, Object> parameters) {
        return getAlgorithm(null, algorithmName, parameters);
    }

    public Algorithm getAlgorithm(
            AlgorithmConnectorConfiguration algorithmConnectorConfiguration,
            String algorithmName,
            Map<String, Object> parameters) {

        for (AlgorithmProvider provider : providers) {
            if (provider.supports(algorithmName)) {
                return provider.createAlgorithm(algorithmConnectorConfiguration, algorithmName, parameters);
            }
        }


        System.err.println("AlgorithmCreationUtils: algorithm " + algorithmName + " not found in " + providers.size() + " AlgorithmProviders");
        return null;
    }


}