package com.xtl.base;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 31925
 * Java的IO、Stream
 */
public class JavaIo {
    public static void main(String[] args) throws IOException {
       testWrite();
       testFile();
    }

    private static void testWrite() throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        char c;
        List<Character> chars=new ArrayList<>();
        // 读取字符
        do {
            c = (char) bufferedReader.read();
            if(c!='q'){
                chars.add(c);
            }
        } while (c != 'q');
        System.out.println("输入的字符为："+chars);
    }

    private static  void testFile() throws IOException {
        String str="天不生我李淳罡，剑道万古如长夜";
        File file=new File("hello.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(str);
        bufferedWriter.close();
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String result=bufferedReader.readLine();
        System.out.println("读取的文件内容是："+result);
    }
}
