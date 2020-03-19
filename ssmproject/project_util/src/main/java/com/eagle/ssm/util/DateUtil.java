package com.eagle.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    //日期转换成字符串
    public static String date2String(Date date, String str){
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        String format = sdf.format(date);
       return format;
    }
    //字符串转换成日期
    public static Date string2Date(String str,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date date = sdf.parse(str);
        return date;
    }
}
