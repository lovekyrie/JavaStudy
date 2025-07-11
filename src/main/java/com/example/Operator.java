/**
 * @author duanyupeng
 * @date 2025年7月09日
 */
package com.example;

public class Operator {
  public static void main(String[] args) {
    // 01算术运算符
    // + - * / %
    int a = 10;
    int b = 20;
    int c = a + b;
    System.out.println("c 的值是：" + c);

    // 前自增 后自增
    int x = 10;
    int y = x++;
    System.out.println("x 的值是：" + x);
    System.out.println("y 的值是：" + y);

    x = 10;
    y = ++x;
    System.out.println("x 的值是：" + x);
    System.out.println("y 的值是：" + y);

    // 02关系运算符
    // > < >= <= == !=
    int a2 = 10;
    int b2 = 20;
    boolean c2 = a2 > b2;
    System.out.println("c2 的值是：" + c2);

    // 03位运算符
    int a3 = 60;
    int b3 = 13;
    System.out.println("a3 的二进制是：" + Integer.toBinaryString(a3));
    System.out.println("b3 的二进制是：" + Integer.toBinaryString(b3));
    // 按位与 &
    System.out.println("a3 & b3 的值是：" + (a3 & b3));
    // 按位或 |
    System.out.println("a3 | b3 的值是：" + (a3 | b3));
    // 按位异或 ^
    System.out.println("a3 ^ b3 的值是：" + (a3 ^ b3));
    // 按位取反 ~
    System.out.println("~a3 的值是：" + (~a3));
    // 左移 <<
    System.out.println("a3 << 2 的值是：" + (a3 << 2));
    // 右移 >>
    System.out.println("a3 >> 2 的值是：" + (a3 >> 2));
    // 无符号右移 >>>
    System.out.println("a3 >>> 2 的值是：" + (a3 >>> 2));

    // 04逻辑运算符
    // && || !
    int a4 = 10;
    int b4 = 5;
    int c4 = 20;
    System.out.println(a4 < b4 && a4 < c4);
    System.out.println(a4 < b4 || a4 < c4);
    System.out.println(!(a4 < b4));

    // 05赋值运算符
    // = += -= *= /= %=
    int a5 = 10;
    a5 += 20;
    System.out.println("a5 的值是：" + a5);
    short b5 = 10;
    short c5 = 20;
    // b5 + c5 会自动提升为 int 类型
    // 需要强制转换为 short 类型
    short d5 = (short) (b5 + c5);
    System.out.println("d5 的值是：" + d5);

    // 06其他运算符
    // ?: 三元运算符
    int a6 = 10;
    int b6 = 20;
    int c6 = a6 > b6 ? a6 : b6;
    System.out.println("c6 的值是：" + c6);

    // 07运算符优先级
    // 优先级从高到低：
    // 括号 ()
    // 自增自减 ++ --
  }
}
