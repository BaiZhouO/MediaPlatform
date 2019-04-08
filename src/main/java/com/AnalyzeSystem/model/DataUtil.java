package com.AnalyzeSystem.model;

public class DataUtil {
    private static String errorMessage="the length of userid must be less than 45";
    //检查str的长度是否合理，若超过45则返回false,因为数据库中字段长度最长为45
    static void checkLength(String str,int maxLength){
        if (str.length()==0||str.length()>maxLength)
            throw new IllegalArgumentException(errorMessage);
    }

}
