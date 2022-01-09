package com.xtl.base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Java的Set集合
 * @author 31925
 */
public class JavaSet {
    public static void main(String[] args) {
        testHashSet();
        testTreeSet();
    }

    private static void testHashSet(){
        Set<String> set = new HashSet<>(Arrays.asList("不良人", "灵主", "杯莫停"));
        for(String ele:set){
            System.out.println(ele);
        }
    }

    private static void testTreeSet(){
        Set<Integer> set=new TreeSet<>(Arrays.asList(120,365,841,269));
        for(Integer ele:set){
            System.out.println(ele);
        }
    }
}
