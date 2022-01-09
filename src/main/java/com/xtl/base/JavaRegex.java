package com.xtl.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 31925
 * Java正则表达式
 */
public class JavaRegex {
    public static void main(String[] args) {
        // 要验证的字符串
        String str = "baike.xsoftlab.net";
        // 正则表达式规则
        String regEx = "baike.*";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        // 查找字符串中是否有匹配正则表达式的字符/字符串
        boolean rs = matcher.find();
        System.out.println(rs);
        String myMail="3192536.97s@gmail.com";
        testMail(myMail);

    }


    private static void testMail(String mail){
        // 邮箱验证规则
        String mailRegEx = "[a-zA-Z_]+[0-9]*@(([a-zA-z0-9]-*)+\\.){1,3}[a-zA-z\\-]+";
        // 忽略大小写的写法
        Pattern pattern=Pattern.compile(mailRegEx,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(mail);
        boolean result=matcher.find();
        System.out.println("测试的字符串是否是邮箱："+result);
    }
}
