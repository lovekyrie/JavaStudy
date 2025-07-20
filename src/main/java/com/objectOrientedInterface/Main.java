/**
 * @author 
 * @date 
 */
package com.objectOrientedInterface;

public class Main {
  // 如果一个抽象类没有字段，所有方法全部都是抽象方法：就可以把抽象类改写成接口：
  public static void main(String[] args) {
    Person p = new Student("Xiao Ming");
    p.run();
    p.hello();
    System.out.println(p.getName());
  }
}

interface Hello {
  void hello();
}

// 接口继承接口，用 extends 关键字：
// (此时，Person接口继承自Hello接口，因此，Person接口现在实际上有3个抽象方法签名，其中一个来自继承的Hello接口)
interface Person extends Hello {
  // 接口中定义的方法，实际上都是 public abstract 方法： (所以不需要写出来， 写不写都一样)
  default void run() {
    // default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段
    // default方法 jdk>=1.8 并且实现Person的接口，不一定要实现default方法，可以不实现。
    System.out.println("Person is running");
  }

  String getName();
}

// 在Java中，一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface
class Student implements Person {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public String getName() {
    return "Student";
  }

  @Override
  public void hello() {
    System.out.println("Hello, " + name);
  }
}
