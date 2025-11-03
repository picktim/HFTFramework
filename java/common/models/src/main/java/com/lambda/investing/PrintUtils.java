package com.lambda.investing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintUtils {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static String PrintDate(Date input) {
        return sdf.format(input);
    }
}
