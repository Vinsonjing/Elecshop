package com.vjsoft.business.utils;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;


//joda-time线程安全，java自带的simpledateformat线程不安全
public class DateUtils {
    public   static  final String STANDARD_FORMAT="yyyy-MM-dd HH:mm:ss";

    /**
     * Date-->string
     * */

    public static  String  dateToStr(Date date,String format){
        if (date==null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(format);
    }
    public static  String  dateToStr(Date date){
        if (date==null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    /**
     * string-->Date
     * */
    public static  Date  strToDate(String str){
       DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(STANDARD_FORMAT);
       DateTime dateTime=dateTimeFormatter.parseDateTime(str);
       return dateTime.toDate();
    }
    public static  Date  strToDate(String str,String format){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(format);
        DateTime dateTime=dateTimeFormatter.parseDateTime(str);
        return dateTime.toDate();
    }


}
