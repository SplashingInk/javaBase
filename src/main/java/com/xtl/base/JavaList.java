package com.xtl.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Java的List集合
 * @author 31925
 */
public class JavaList {
    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
    }

    private static void testArrayList(){
        List<String> list=new ArrayList<>();
        list.add("C++");
        list.add("Java");
        list.add("Python");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void testLinkedList(){
        List<Integer> list=new LinkedList<>();
        list.add(520);
        list.add(618);
        list.add(1314);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
