package com.fengfortitude.basic;

public class TwoComplementDemo {
  public static void main(String[] args) {
    System.out.println("=== 二进制补码演示 ===");

    // 演示int类型的范围
    int minInt = Integer.MIN_VALUE; // -2^31
    int maxInt = Integer.MAX_VALUE; // 2^31 - 1

    System.out.println("int最小值: " + minInt);
    System.out.println("int最大值: " + maxInt);
    System.out.println("int最小值二进制: " + Integer.toBinaryString(minInt));
    System.out.println("int最大值二进制: " + Integer.toBinaryString(maxInt));

    System.out.println("\n=== 为什么最小值是-2^31 ===");
    System.out.println("1. 32位int总共可以表示 2^32 个不同的数");
    System.out.println("2. 包括正数、负数和0");
    System.out.println("3. 0占用一个位置");
    System.out.println("4. 剩下的 2^32 - 1 = 4,294,967,295 个数要分配给正数和负数");
    System.out.println("5. 由于0的存在，正数和负数不可能完全对称");
    System.out.println("6. 所以负数比正数多一个：负数有 2^31 个，正数有 2^31 - 1 个");

    System.out.println("\n=== 补码计算演示 ===");
    // 演示-1的补码计算
    System.out.println("以-1为例：");
    System.out.println("1的二进制: " + Integer.toBinaryString(1));
    System.out.println("按位取反: " + Integer.toBinaryString(~1));
    System.out.println("加1后: " + Integer.toBinaryString(~1 + 1));
    System.out.println("-1的二进制: " + Integer.toBinaryString(-1));

    // 演示最小值的特殊性
    System.out.println("\n=== 最小值的特殊性 ===");
    System.out.println("最小值 " + minInt + " 的二进制: " + Integer.toBinaryString(minInt));
    System.out.println("如果尝试对最小值取负: " + (-minInt));
    System.out.println("注意：对最小值取负仍然是它自己！这是补码的一个特性");
  }
}
