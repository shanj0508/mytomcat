package com.java_demo;

/***
 * 编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等
 * 于50，打印“hello world!”
 */

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1=scan.nextInt();
        System.out.println("请输入第二个整数：");
        int num2=scan.nextInt();
        if(num1+num2>=50){
            System.out.println("hello world!");
        }
    }
}
