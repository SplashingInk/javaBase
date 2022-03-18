package com.xtl.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author xtl
 * @Date 2022/2/11 11:46
 */
public class StringTest {

    public static void main(String[] args) {
        String str="hello,花有(清香)月有!阴?520welcome&to1314@春宵一刻*值千金_java";
        List<String> words = extractWords(str);
        System.out.println(str+"\t\t中所有的英文字符是"+words);
        List<Integer> digital = extractDigital(str);
        System.out.println(str+"\t\t中所有的数字是"+digital);
        List<String> chinese = extractChinese(str);
        System.out.println(str+"\t\t中所有的中文是"+chinese);
        List<Character> specialChar = extractSpecialChar(str);
        System.out.println(str+"\t\t中所有的特殊字符是"+specialChar);
    }

    /**
     *@descrition 查找所有的英文字符
     * @param str 需要查找的字符串
     *@return 返回所有 的英文字符
     */
    private static List<String> extractWords(String str){
        List<String> words=new ArrayList<>();
        //提取英文字符
        String charEx="[a-zA-Z]";
        Pattern pattern=Pattern.compile(charEx);
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            words.add(matcher.group());
        }
        return words;
    }
    /**
     *@descrition 找出所有的数字
     * @param str 需要查找的字符串
     *@return  所有的数字
     */
    private static List<Integer> extractDigital(String str){
        List<Integer> digital=new ArrayList<>();
        String digitalEx="[0-9]";
        Pattern pattern=Pattern.compile(digitalEx);
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            digital.add(Integer.parseInt(matcher.group()));
        }
        return digital;
    }

    private static List<Character> extractSpecialChar(String str){
        List<Character> specialChar=new ArrayList<>();
        //提取特殊字符
        String charEx="[^a-zA-Z0-9\\u4e00-\\u9fa5]";
        Pattern pattern=Pattern.compile(charEx);
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            specialChar.add(matcher.group().charAt(0));
        }
        return specialChar;
    }

    private static List<String> extractChinese(String str){
        List<String> chinese=new ArrayList<>();
        //提取中文
        String charEx="[\\u4e00-\\u9fa5]";
        Pattern pattern=Pattern.compile(charEx);
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            chinese.add(matcher.group());
        }
        return chinese;
    }

}
