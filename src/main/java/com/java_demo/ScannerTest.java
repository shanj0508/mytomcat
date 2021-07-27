package com.java_demo;

/***
 * 从键盘获取不同类型的变量，需要使用Scanner类
 * 具体实现步骤：
 * 1、导包：import java.util.Scanner;
 * 2、Scanner的实例化: Scanner scan = new Scanner(System.in);
 * 3、调用Scanner类的相关方法，来获取指定类型的变量；
 */

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //Scanner的实例化
        Scanner scan = new Scanner(System.in);
        //从键盘获取String类型的值
        System.out.println("请输入你的姓名：");
        String name=scan.next();
        System.out.println("你输入的name是："+name);
        //从键盘获取int类型的值
        System.out.println("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.println("你输入的age是："+age);
        //从键盘获取double类型的值
        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println("你输入的weight是："+weight);
        //从键盘获取boolean类型的值
        System.out.println("你还在上学吗？(true/false)");
        boolean res = scan.nextBoolean();
        System.out.println("你输入的res是："+res);
        //对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
        System.out.println("请输入你的性别？(男/女)");
        String gender = scan.next(); //"男" "女"
        char genderChar=gender.charAt(0);//获取索引为0位置上的字符char值
        System.out.println("你输入的gender是："+gender);
        System.out.println("genderChar是："+genderChar);

    }

}
