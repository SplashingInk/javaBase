package com.xtl.base;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName JavaStream
 * @Description java流操作
 * @Author xtl
 * @Date 2022/2/9 15:56
 */
public class JavaStream {
    public static void main(String[] args) {
        System.out.println(Stream.of("beijing", "tianjin", "shanghai", "wuhan").map(String::length).filter(e -> e > 5).collect(Collectors.toList()));
    }

}
