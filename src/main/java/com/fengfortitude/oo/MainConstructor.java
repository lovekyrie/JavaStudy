/**
 * @author duanyupeng
 * @date 2025年7月16日
 */
package com.fengfortitude.oo;

// 构造方法
public class MainConstructor {
  public static void main(String[] args) {
    // 当自定义了构造方法后，默认的构造方法就被覆盖了，所以需要手动调用构造方法
    // 在java中创建对象的顺序是：
    // 1. 先初始化字段
    // 2. 再执行构造方法的代码 (所以会覆盖默认的字段初始化时的值)
    Dog dog = new Dog("旺财", 3);
    System.out.println(dog.getName());
    System.out.println(dog.getAge());
  }
}

class Dog {
  // 没有在构造方法中初始化字段时，引用类型的字段默认是null，数值类型的字段用默认值，int类型默认值是0，布尔类型默认值是false：

  private String name = "小黑";
  private int age = 2;

  // 如果想要保留默认的构造方法, 需要自己定义出来
  // 一个构造方法可以调用其他构造方法，这样做的目的是便于代码复用。
  public Dog() {
    this("小花");
  }

  // 构造函数可以重载
  public Dog(String name) {
    this(name, 2);
  }

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

}
