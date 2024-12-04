package com.consumer.controller;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 堆溢出， 只要不停的新建对象，就会堆溢出
 */
@Slf4j
public class HeapOOM {
    public static void main(String[] args) {
//        System.out.print("最大内存： ");
//        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "MB");
//        System.out.print("可用内存： ");
//        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "MB");
//        System.out.print("已使用内存： ");
//        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "MB");
//
//        List<HeapOOM> list = new ArrayList<>();
//        while (true) {
//            list.add(new HeapOOM());
//        }
        double a = 0.2;
        double b = 0.3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(0.2 + 0.3);
        BigDecimal a1 = new BigDecimal("0.2");
        BigDecimal b1 = new BigDecimal("0.3111");
        System.out.println();
        System.out.println(a1.add(b1));
        System.out.println(a1.subtract(b1));
        System.out.println(a1.multiply(b1));
        System.out.println(a1.divide(b1, 2, RoundingMode.HALF_UP));
        System.out.println(a1.remainder(b1));
        System.out.println(a1.compareTo(b1));
        System.out.println(a1.equals(b1));

    }
}


