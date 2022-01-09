package com.xtl.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 31925
 * Java的循环结构
 */
public class LoopStructure {
    public static void main(String[] args) {
        int seed=0,evenTotal=0;
        while(seed<100){
            evenTotal+=seed;
            seed+=2;
        }
        System.out.println("100以内所有的偶数的总和为："+evenTotal);

        seed=1;
        int oddTotal=0;
        do{
            oddTotal+=seed;
            seed+=2;
        }while (seed<100);
        System.out.println("100以内所有的奇数的总和为："+oddTotal);

        List<Integer> primeList=new ArrayList<>();
        int i, j, k;
        for (i = 2; i < 100; i++) {
            k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > k) {
                primeList.add(i);
            }
        }
        System.out.println("100以内的所有质数（素数）："+primeList);
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name +"\t");
        }
        System.out.println();
    }
}
