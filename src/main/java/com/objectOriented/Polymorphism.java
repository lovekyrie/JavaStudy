/**
 * @author duanyupeng
 * @date 2025年7月17日
 */
package com.objectOriented;


public class Polymorphism {
  // 对于一个类的实例字段，如果用final修饰，那么这个字段不能被修改
  public final String name;

  // 可以在构造函数中初始化final字段
  public Polymorphism(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
    Income[] incomes =
        new Income[] {new Income(3000), new SalaryIncome(7500), new StateCouncilSpecialAllowance()};
    System.out.println(totalTax(incomes));
  }

  public static double totalTax(Income[] incomes) {
    double total = 0;
    for (Income income : incomes) {
      total += income.getTax();
    }
    return total;
  }

  // 利用多态 覆写Object方法
  // Object定义了几个重要的方法：
  // toString()：把instance输出为String；
  // equals()：判断两个instance是否逻辑相等；
  // hashCode()：计算一个instance的哈希值。

  // 覆写toString()方法，打印的不再是对象的地址，而是我们设定的字符串
  @Override
  public String toString() {
    return "Person name=" + name;
  }

  // 覆写equals()方法，判断两个对象是否逻辑相等
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Polymorphism) {
      Polymorphism p = (Polymorphism) obj;
      return this.name.equals(p.name);
    }
    return false;
  }

  // 覆写hashCode()方法，计算一个对象的哈希值
  @Override
  public int hashCode() {
    return this.name.hashCode();
  }

  public final String hello() {
    return "hello";
  }
}

class Dog extends Polymorphism {
  public Dog(String name) {
    super(name);
  }
  // @Override
  // 如果父类被final修饰，则子类不能覆写该方法
  // public String hello() {
  //   return "dog hello";
  // }

  // 同理如果一个类不想被别的类即成，那么可以加上final修饰符
}


class Income {
  protected double income;

  public Income(double income) {
    this.income = income;
  }

  public double getTax() {
    return income * 0.1;
  }
}


// 对于工资收入，可以减去一个基数
class SalaryIncome extends Income {
  public SalaryIncome(double income) {
    super(income);
  }

  @Override
  public double getTax() {
    // 子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用
    // super.getTax()
    if (income <= 5000) {
      return 0;
    }
    return (income - 5000) * 0.2;
  }
}


// 如果你享受国务院特殊津贴，那么按照规定，可以全部免税。
class StateCouncilSpecialAllowance extends Income {
  public StateCouncilSpecialAllowance() {
    super(0);
  }

  @Override
  public double getTax() {
    return 0;
  }
}
