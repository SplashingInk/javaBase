package com.xtl.exam;

import java.util.*;

/**
 * @ClassName StringLength
 * @Description TODO
 * @Author xtl
 * @Date 2022/2/11 16:30
 */
public class StringLength {
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        System.out.println(fullEightString());
    }

    private static int getLastWordLength(){
        String str="";
        str=scanner.nextLine();
        String[] strArray=str.split(" ");
        System.out.println(Arrays.toString(strArray));
        return strArray[strArray.length-1].length();
    }

    private static int charCount(){
        String str="";
        str=scanner.nextLine();
        char target=scanner.next().charAt(0);
        return str.toLowerCase().length() - str.toLowerCase().replaceAll(String.valueOf(target).toLowerCase(), "").length();
    }

    private static List<Integer> randomCount(){
       List<Integer> result=new ArrayList<>();
       while(scanner.hasNext()){
           int count=scanner.nextInt();
           if(count==1000){
               break;
           }
           List<Integer> temp=new ArrayList<>();
           for (int i = 0; i < count; i++) {
               temp.add(new Random().nextInt(500));
           }
           Collections.sort(temp);
           result.add(temp.get(0));
           System.out.println(temp.get(0));
           for (int i = 1; i <temp.size() ; i++) {
               if(!temp.get(i).equals(temp.get(i - 1))){
                   result.add(temp.get(i));
                   System.out.println(temp.get(i));
               }
           }
           temp=null;
       }
        return result;
    }

    private static List<String> fullEightString(){
        List<String> source=new ArrayList<>();
        while(scanner.hasNext()){
            String input = scanner.nextLine();
            if("quit".equals(input)){
                break;
            }
            int len=8;
            StringBuilder stringBuilder=new StringBuilder();
            if(input.length()<len){
                stringBuilder=new StringBuilder(input);
                for(int i=0;i<len-input.length();i++){
                    stringBuilder.append(0);
                }
                source.add(stringBuilder.toString());
            }else{
                int size=input.length()%len==0?input.length()/len:input.length()/len+1;
                for (int i = 0,j=0; i <size ; i++) {
                    if(i==size-1){
                        stringBuilder=new StringBuilder(input.substring(j,input.length()));
                        for(int k=0;k<len-(input.length()-j);k++){
                           stringBuilder.append(0);
                        }
                        source.add(stringBuilder.toString());
                    }else {
                        source.add(input.substring(j,j+len));
                    }
                    j+=len;
                }
            }
        }
        return source;
    }
}
