/**
 * @author duanyupeng
 * @date 2025年7月09日
 */
package com.fengfortitude.basic;

public class DataTypeTransfer {
  public static void main(String[] args) {
    // 如果任一操作数是 double 类型，其他操作数将被转换为 double 类型。
    // 否则，如果任一操作数是 float 类型，其他操作数将被转换为 float 类型。
    // 否则，如果任一操作数是 long 类型，其他操作数将被转换为 long 类型。
    // 否则，所有操作数将被转换为 int 类型。

    // 自动类型转换只发生在兼容类型之间
    // byte -> short -> int -> long -> float -> double
    // char -> int -> long -> float -> double

    int a = 10;
    double b = 20.0;
    double c = a + b;
    System.out.println("c 的值是：" + c);

    // 注意：char 类型比较特殊，char 自动转换成 int、long、float 和 double，但 byte 和 short 不能自动转换为 char，而且 char
    // 也不能自动转换为 byte 或 short。
    byte b1 = 10;
    // 报错：Type mismatch: cannot convert from byte to char
    // char c1 = b1;
    // System.out.println("c1 的值是：" + c1);

    // 强制类型转换
    // 将较大的数据类型转换为较小的数据类型。
    // 将浮点数转换为整数。
    // 将字符类型转换为数值类型。
    // 因此，在进行强制类型转换时，需要确保转换后的值仍然在目标类型的范围内。
    // double -> float -> long -> int -> char -> short -> byte
    int d = 1000;
    byte e = (byte) d;
    System.out.println("e 的值是：" + e);

  }
}
