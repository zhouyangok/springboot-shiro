package com.crazyang.util;

/**
 * @ClassName StringTools
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/7 下午10:07.
 */

public class StringTools {

    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }
}
