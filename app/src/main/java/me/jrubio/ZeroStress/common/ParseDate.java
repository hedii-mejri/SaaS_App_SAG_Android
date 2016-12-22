package me.jrubio.ZeroStress.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class ParseDate {

    public static final String DATE_PATTERN = "dd-MM-yyyy HH:mm:ss";
    public static final String HOUR_PATTERN = "HH:mm:ss";

    public static String parseDate(Long timestamp, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.FRANCE);
        Long now  = (timestamp != null) ? timestamp : new Date().getTime();
        Date date = new Date(now);
        return format.format(date);
    }

}
