package com.lambda.investing.algorithmic_trading.data;

import com.lambda.investing.data_manager.parquet.AvroParquetDataManager;
import com.lambda.investing.data_manager.parquet.ParquetDataManager;
import com.lambda.investing.model.asset.Currency;
import com.lambda.investing.model.asset.Instrument;
import com.lambda.investing.model.candle.Candle;
import com.lambda.investing.model.candle.CandleType;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CandleDataTest {
    String lambdaDataPath = "lambda_data";

    public CandleDataTest() throws Exception {
        Map<String, String> env = new HashMap<>();
        String lambdaDataPathRsrs = ParquetDataManager.class.getClassLoader().getResource(lambdaDataPath).getPath();
        env.put("LAMBDA_DATA_PATH", lambdaDataPathRsrs);
        setEnv(env);
        AddTestInstruments();

    }

    private static void setEnv(Map<String, String> newenv) throws Exception {
        try {
            Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
            Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
            theEnvironmentField.setAccessible(true);
            Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
            env.putAll(newenv);
            Field theCaseInsensitiveEnvironmentField = processEnvironmentClass
                    .getDeclaredField("theCaseInsensitiveEnvironment");
            theCaseInsensitiveEnvironmentField.setAccessible(true);
            Map<String, String> cienv = (Map<String, String>) theCaseInsensitiveEnvironmentField.get(null);
            cienv.putAll(newenv);
        } catch (NoSuchFieldException e) {
            Class[] classes = Collections.class.getDeclaredClasses();
            Map<String, String> env = System.getenv();
            for (Class cl : classes) {
                if ("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
                    Field field = cl.getDeclaredField("m");
                    field.setAccessible(true);
                    Object obj = field.get(env);
                    Map<String, String> map = (Map<String, String>) obj;
                    map.clear();
                    map.putAll(newenv);
                }
            }
        }
    }

    public static void AddTestInstruments() {
        Instrument instrument = new Instrument();
        instrument.setPrimaryKey("dogeeur_kraken");
        instrument.setSymbol("dogeeur");
        instrument.setMarket("kraken");
        instrument.setCurrency(Currency.EUR);
        instrument.setPriceTick(0.01);
        instrument.setQuantityTick(0.00001);
        instrument.setMakerFeePct(0.1);
        instrument.setTakerFeePct(0.1);
        instrument.addMap();

    }


    @Test
    void downloadCandles() {
        CandleData candleData = new CandleData();

        Set<String> instrumentPks = new HashSet<>() {
            {
                add("dogeeur_kraken");

            }
        };
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.MARCH, 19, 7, 0, 0);
        Date startDate = calendar.getTime();

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2025, Calendar.MARCH, 19, 14, 0, 0);
        Date endDate = calendar2.getTime();


        Map<String, List<Candle>> candles = candleData.downloadCandles(startDate, endDate, instrumentPks, CandleType.mid_time_seconds_threshold, 60);
        assertNotNull(candles);
        assertTrue(candles.containsKey("dogeeur_kraken"));

    }
}