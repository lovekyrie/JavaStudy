/**
 * @author duanyupeng
 * @date 2025年7月16日
 */
package com.objectOriented;

public class MethodOverloading {
  // 方法名相同，但参数不同，称为方法重载
  public void hello() {
    System.out.println("hello");
  }

  public void hello(String name) {
    System.out.println("hello " + name);
  }

  public void hello(String name, int age) {
    if (age < 18) {
      System.out.println("hello " + name + " you are a child");
    } else {
      System.out.println("hello " + name + " you are an adult");
    }
  }

  public static void main(String[] args) {
    // 举个例子 String类提供了多个indexOf方法
    String s = "Test string";
    // 根据字符的unicode编码查找
    int n1 = s.indexOf('e');
    // 根据字符串查找
    int n2 = s.indexOf("st");
    // 根据字符串查找，从指定位置开始
    int n3 = s.indexOf("st", 4);
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
  }
}
