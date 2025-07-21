/**
 * @author duanyupeng
 * @date 2025-07-20
 */
package com.fengfortitude.ooabstract;

public class Main {
  public static void main(String[] args) {
    Person person = new Student();
    person.run();
  }
}

class Student extends Person {
  @Override
  public void run() {
    System.out.println("Student is running");
  }
}

abstract class Person {
  public abstract void run();
}