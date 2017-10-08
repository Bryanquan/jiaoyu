package com.util;

import java.security.MessageDigest;

/**
 * md5
 */
public class Md5Util {

    public static String md5(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes("GBK"));
            StringBuilder builder = new StringBuilder();
            for (byte b : md.digest()) {
                builder.append(String.format("%02x", b & 0xff));
            }
            return builder.toString();
        } catch (Exception e) {
            System.out.println(e.getCause());
            return null;
        }
    }
}
