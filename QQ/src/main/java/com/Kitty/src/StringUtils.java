package com.Kitty.src;

public class StringUtils {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static final boolean isEmpty(String str){
        if(str == null || str.length()<1 || "".equals(str.trim())){
            return true;
        }else {
            return false;
        }
    }



}
