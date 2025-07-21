/**
 * @author duanyupeng
 * @date 2025年7月12日
 */
package com.fengfortitude.basic;

public class ProcessControl {

  public enum PlayerType {
    TENNIS,
    FOOTBALL,
    BASKETBALL,
    UNKNOWN
  }

  public static void main(String[] args) {
    
    // if-else 语句
    // 判断闰年
    int year = 2025;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + "年是闰年");
    } else {
      System.out.println(year + "年是平年");
    }

    // switch语句
    // 用来判断一个变量与多个值之间的相等性，变量的类型可以是： byte、short、int、char、String、枚举(自定义）、包装类
    PlayerType playerType = PlayerType.TENNIS;
    String playerTypeStr = getPlayerType(playerType);
    System.out.println(playerTypeStr);

    // for循环
    for (int i = 0; i < 5; i++) {
      System.out.println("测试输出：" + i);
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("❤");
      }
      System.out.println();
    }

    // while循环
    int j = 0;
    while (j < 10) {
      System.out.println("循环输出：" + j);
      j++;
    }
  }

  private static String getPlayerType(PlayerType playerType) {
    switch (playerType) {
      case TENNIS:
        return "网球";
      case FOOTBALL:
        return "足球";
      case BASKETBALL:
        return "篮球";
      case UNKNOWN:
        throw new IllegalArgumentException("未知类型");
      default:
        throw new IllegalArgumentException("未知类型");
    }
  }
}
