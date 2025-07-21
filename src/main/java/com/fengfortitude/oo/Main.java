/**
 * @author duanyupeng
 * @date 2025年7月15日
 */
package com.fengfortitude.oo;

// 不能在同一个package 建立同样的类名，否则会报错
class Person {
  private String name;
  protected int age;
  private int birthYear;
  private String[] names;

  // 在方法内部，可以使用一个隐含的变量this，它始终指向当前实例。
  public String getName() {
    // 如果没有命名冲突，可以省略this
    return name;
  }

  public int getAge() {
    // 内部可以访问私有方法，外部不能访问
    return calcAge(2025);
  }

  // 但是，如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this
  public void setName(String name) {
    this.name = name;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public void setAge(int age) {
    if (age < 0 || age > 100) {
      throw new IllegalArgumentException("年龄必须在0-100之间");
    }
    this.age = age;
  }

  private int calcAge(int currentYear) {
    return currentYear - this.birthYear;
  }

  public void setNameAndAge(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
  }

  public void run() {
    System.out.println("Person is running");
  }

}

class Group {
  private String[] names;
  // 可变参数
  public void setNames(String... names) {
    this.names = names;
    System.out.println(names.length);
  }
}

class Cat {
  private int age;
  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

public class Main {
  public static void main(String[] args) {
    Person ming = new Person();
    // 私有属性不能访问
    // person.name = "张三";
    // person.age = 20;

    ming.setName("小明");
    ming.setBirthYear(2013);
    System.out.println(ming.getName() + "," + ming.getAge());

    Person hong = new Person();
    // 调用方法时严格按参数的顺序依次传入，不能多传也不能少传（这跟javascript不同）
    hong.setNameAndAge("小红", 15);
    hong.setBirthYear(2015);
    System.out.println(hong.getName() + "," + hong.getAge());

    Group group = new Group();
    group.setNames("Lisa", "Simpson", "Bart", "Lisa", "Lisa");
    group.setNames("wade", "james", "bosh");

    // 基本类型参数绑定
    Cat cat = new Cat();
    int n = 10;
    cat.setAge(n);
    System.out.println(cat.getAge());
    n = 20;
    System.out.println(cat.getAge());

    // 引用类型参数绑定
    // p.name 和 bob 只是“曾经指向同一个字符串对象”，但之后各自独立，改变 bob 的指向不会影响 p.name。
    Person p = new Person();
    String bob = "Bob";
    p.setName(bob);
    System.out.println(p.getName());
    bob = "Alice";
    System.out.println(p.getName());
  }
}
