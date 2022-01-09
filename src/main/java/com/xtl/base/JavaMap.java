package com.xtl.base;

import java.util.*;

/**
 * Java的Map集合
 * @author 31925
 */
public class JavaMap {
    public static void main(String[] args) {
        testHashMap();
        testTreeMap();
        testLinkedHashMap();
    }

    private static void testHashMap(){
        Map<String,String> map=new HashMap<>(16);
        map.put("剑风传奇","日漫");
        map.put("狐妖小红娘","国漫");
        map.put("金秘书为何突然这样","韩漫");
        System.out.println("HashMap的遍历结果是：");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("键是："+entry.getKey()+"\t 值是："+entry.getValue());
        }
    }

    private static void testTreeMap(){
        Map<Person, Integer> map = new TreeMap<>((o1, o2) -> {
            if(o1.grade.equals(o2.grade)){
                return 0;
            }
            return o1.grade<o2.grade?-1:1;
        });
        map.put(new Person("Tom",85), 1);
        map.put(new Person("Bob",65), 2);
        map.put(new Person("Lily",90), 3);
        map.put(new Person("Jack",65), 4);
        for (Person key : map.keySet()) {
            System.out.println(key);
        }
    }

    private static void testLinkedHashMap(){
        Map<String, String> map=new LinkedHashMap<>();
        map.put("joker","小丑");
        map.put("king","国王");
        map.put("queen","女王");
        map.put("knight","骑士");
        printMap(map);
    }

    private static void printMap(Map<String,String> map){
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println("key："+entry.getKey()+"\t value："+entry.getValue());
        }
    }
}

class Person {
    public String name;
    public Integer grade;
    Person(String name,Integer grade) {
        this.name = name;
        this.grade=grade;
    }
    @Override
    public String toString() {
        return "{姓名：" + name + "\t成绩："+grade+"}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
