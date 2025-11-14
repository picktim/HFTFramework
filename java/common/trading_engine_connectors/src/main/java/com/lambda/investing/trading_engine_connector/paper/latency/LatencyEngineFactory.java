package com.lambda.investing.trading_engine_connector.paper.latency;

import com.lambda.investing.Configuration;

public class LatencyEngineFactory {

    public static LatencyEngine getLatencyEngine(Configuration.LatencyEngineType latencyEngineType, long meanLatencyMs) {
        if (latencyEngineType == Configuration.LatencyEngineType.FIXED) {
            return new FixedLatencyEngine(meanLatencyMs);
        } else if (latencyEngineType == Configuration.LatencyEngineType.POISSON) {
            return new PoissonLatencyEngine(meanLatencyMs);
        } else {
            throw new IllegalArgumentException("Unknown latency engine type: " + latencyEngineType);
        }
    }

    public static LatencyEngine getLatencyEngine(Configuration.LatencyEngineType latencyEngineType, long meanLatencyMs, long seed) {
        if (seed == 0) {
            return getLatencyEngine(latencyEngineType, meanLatencyMs);
        }

        if (latencyEngineType == Configuration.LatencyEngineType.FIXED) {
            return new FixedLatencyEngine(meanLatencyMs);
        } else if (latencyEngineType == Configuration.LatencyEngineType.POISSON) {
            return new PoissonLatencyEngine(meanLatencyMs, seed);
        } else {
            throw new IllegalArgumentException("Unknown latency engine type: " + latencyEngineType);
        }
    }
}
