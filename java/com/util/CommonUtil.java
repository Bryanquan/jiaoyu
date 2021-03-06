package com.util;

/**
 * @author bryan quan
 */
public class CommonUtil {

    public static boolean isNull(Object object) {

        return object == null;
    }

    public static boolean isNotNull(Object object) {
        return object != null;
    }

    public static <E> E cast(Object object) {
        return (E) object;
    }


}
