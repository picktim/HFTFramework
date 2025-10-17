package com.lambda.investing.algorithmic_trading.provider;

import com.lambda.investing.algorithmic_trading.Algorithm;
import com.lambda.investing.algorithmic_trading.AlgorithmConnectorConfiguration;

import java.util.Map;

public interface AlgorithmProvider {
    Algorithm createAlgorithm(AlgorithmConnectorConfiguration config, String algorithmName, Map<String, Object> parameters);

    boolean supports(String algorithmName);
}