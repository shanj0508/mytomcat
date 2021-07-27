package com.java_demo;

/***
 * 编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，
 * 且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
 */

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个double型数值：");
        double num1 = scan.nextDouble();
        System.out.println("请输入第二个double型数值：");
        double num2 = scan.nextDouble();
        if (num1 > 10.0 && num2 < 20.0) {
            double res = num1 + num2;
            System.out.println("num1+num2=" + res);

        } else {
            double res = num1 * num2;
            System.out.println("num1*num2=" + res);
        }

    }
}
