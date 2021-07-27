package com.java_demo;

/***
 * 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每
 * 一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
 * 相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
 * 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人
 * 类的年龄。如果用户输入负数，请显示一个提示信息。
 */

import java.util.Scanner;

public class ifDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入小狗的年龄：");
        int age = scan.nextInt();
        double humanAge;
        if (age < 0) {
            System.out.println("请输入一个大于或等于0的年龄");
        } else if (age <= 2) {
            humanAge = age * 10.5;
            System.out.println("小狗对应的人类年龄是：" + humanAge + "岁");
        } else {
            humanAge = 2 * 10.5 + (age - 2) * 4;
            System.out.println("小狗对应的人类年龄是：" + humanAge + "岁");
        }

    }
}
