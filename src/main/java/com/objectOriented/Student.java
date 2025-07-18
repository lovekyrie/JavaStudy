/**
 * @author duanyupeng
 * @date 2025年7月16日
 */
package com.objectOriented;

public class Student extends Person {
  private int score;

  public Student(String name, int age, int score) {
    // 如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法。
    // 即子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的。
    super(name, age);
    this.score = score;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  // 子类无法访问父类的private字段或者private方法
  public String hello() {
    // 下面语句会报错
    // return "hello, " + name;
    return "hello, " + super.getName();
  }

  // 为了让子类能够访问父类的字段，可以设置为protected
  public int getAge() {
    return age;
  }

  @Override
  public void run() {
    System.out.println("Student is running");
  }

}

// practice PrimaryStudent继承Student，扩展属性grade 
class PrimaryStudent extends Student {
  private int grade;

  public PrimaryStudent(String name, int age, int score, int grade) {
    super(name, age, score);
    this.grade = grade;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }
  
}
