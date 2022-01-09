package com.xtl.base;

import java.util.Arrays;

/**
 * @author 31925
 * Java的方法
 */
public class JavaMethod {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxAndMin(12, 36, 52, 20, 41, 23)));
    }

    private static int[] maxAndMin(int... args){
        int max=args[0],min=args[0];
        for(int i:args){
            max= Math.max(max, i);
            min= Math.min(min, i);
        }
        return new int[]{max,min};
    }
}
