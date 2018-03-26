package org.eking.tourism.common.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by yg.zhi on 2017/9/1.
 */
public class CommonUtil {
    /**
     * 获取系统当前时间戳(精确到秒)
     *
     * @return
     */
    public static int getSysCurrentTimeSec() {
        return Integer.parseInt("" + (System.currentTimeMillis() / 1000));
    }


    public static int getDateTimeSec(Date date) {
        return (int) (date.getTime() / 1000);
    }

    public static int getDateTimeSec(String dateStr, String pattern) {
        try {
            return getDateTimeSec(parseDate(dateStr, pattern));
        } catch (ParseException e) {
            e.printStackTrace();
            return getSysCurrentTimeSec();
        }
    }

    public static Date parseDate(String strDate, String... patterns) throws ParseException {
        return StringUtils.isEmpty(strDate) ? null : DateUtils.parseDate(strDate, patterns);
    }

    /**
     * 处理 BigDecimal
     *
     * @param decimal
     * @return
     */
    public static BigDecimal getSafeBigDecimal(BigDecimal decimal) {
        return decimal == null ? BigDecimal.ZERO : decimal;
    }

}
