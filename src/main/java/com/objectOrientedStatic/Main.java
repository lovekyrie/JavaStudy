/**
 * @author duanyupeng 
 * @date 2025-07-20
 */
package com.objectOrientedStatic;

public class Main {
  public static void main(String[] args) {
    Person ming = new Person("Xiao Ming", 12);
    //荐使用对象引用访问静态字段，因为不同的对象实例会各自独立维护一份静态字段，
    // 因此，会出现大量静态字段完全相同的“空对象”。b
    ming.count = 100;
    System.out.println(ming.count);
    Person hong = new Person("Xiao Hong", 15);
    System.out.println(hong.count);
    // 推荐使用类名来访问静态字段，可以保证所有对象访问的静态字段都是同一个字段。
    System.out.println(Person.count);
  }
}

class Person {
  public String name;
  public int age;
  public static int count = 0;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

