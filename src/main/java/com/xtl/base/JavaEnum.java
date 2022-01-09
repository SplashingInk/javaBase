package com.xtl.base;


/**
 * Java枚举
 * @author 31925
 */
public class JavaEnum {
    public static void main(String[] args) {
        Color[] colors=Color.values();
        for(Color color:colors){
            //获取索引
            System.out.println(color+" at index "+color.ordinal());
        }
        System.out.println(Color.valueOf("RED"));
    }
}
