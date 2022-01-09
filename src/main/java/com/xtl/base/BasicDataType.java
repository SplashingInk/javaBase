package com.xtl.base;


/**
 * @author 31925
 * Java的基本数据类型
 */
public class BasicDataType {
    public static void main(String[] args) {
        byte a=12;
        System.out.println("byte给出的实例数据是："+a+",byte数据类型的范围是"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE+"\t 所占用的字节数是："+Byte.BYTES);
        short b=23;
        System.out.println("short给出的实例数据是："+b+",short数据类型的范围是"+Short.MIN_VALUE+"~"+Short.MAX_VALUE+"\t 所占用的字节数是："+Short.BYTES);
        int c=520;
        System.out.println("int给出的实例数据是："+c+",int数据类型的范围是"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE+"\t 所占用的字节数是："+Integer.BYTES);
        long d=1314L;
        System.out.println("long给出的实例数据是："+d+",long数据类型的范围是"+Long.MIN_VALUE+"~"+Long.MAX_VALUE+"\t 所占用的字节数是："+Long.BYTES);
        float e=3.14f;
        System.out.println("float给出的实例数据是："+e+",float数据类型的范围是"+Float.MIN_VALUE+"~"+Float.MAX_VALUE+"\t 所占用的字节数是："+Float.BYTES);
        double f=520.5;
        System.out.println("double给出的实例数据是："+f+",double数据类型的范围是"+Double.MIN_VALUE+"~"+Double.MAX_VALUE+"\t 所占用的字节数是："+Double.BYTES);
        boolean g=false;
        System.out.println("boolean给出的实例数据是："+g+",boolean数据类型的范围是"+true+"和"+ false);
        char h='爱';
        System.out.println("char给出的实例数据是："+h+"\t 所占用的字节数是："+Character.BYTES);
    }
}
