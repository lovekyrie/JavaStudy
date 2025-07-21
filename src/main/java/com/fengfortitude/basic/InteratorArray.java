/**
 * @author duanyupeng
 * @date 2025年7月14日
 */
package com.fengfortitude.basic;

import java.util.Arrays;

public class InteratorArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    // 使用for循环遍历数组
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // 使用for-each循环遍历数组
    for (int i : arr) {
      System.out.println(i);
    }

    System.out.println(Arrays.toString(arr));

    // practice
    int[] ns = {1, 4, 9, 16, 25};
    for (int i = ns.length - 1; i >= 0; i--) {
      System.out.println(ns[i]);
    }

    // 数组排序
    // 1. 冒泡排序 每一轮循环后，最大的数会冒泡到最右边
    int[] ns2 = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
    for (int i = 0; i < ns2.length - 1; i++) {
      for (int j = 0; j < ns2.length - i - 1; j++) {
        if (ns2[j] > ns2[j + 1]) {
          int temp = ns2[j];
          ns2[j] = ns2[j + 1];
          ns2[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(ns2));

    // java标准库内置了排序功能
    Arrays.sort(ns2);
    System.out.println(Arrays.toString(ns2));

    // practice (倒序)
    int[] ns3 = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
    for (int i = 0; i < ns3.length - 1; i++) {
      for (int j = 0; j < ns3.length - i - 1; j++) {
        if (ns3[j] < ns3[j + 1]) {
          int temp = ns3[j];
          ns3[j] = ns3[j + 1];
          ns3[j + 1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(ns3));

    // 多维数组
    int[][] ns4 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    System.out.println(Arrays.deepToString(ns4));


    // practice 计算所有学生的平均分
    int[][] scores = {{82, 90, 91}, {68, 72, 64}, {95, 91, 89}, {67, 52, 60}, {79, 81, 85}};
    double average = 0;
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        average += scores[i][j];
      }
    }
    average /= scores.length * scores[0].length;
    System.out.println(average);
    if (Math.abs(average - 77.733333) < 0.000001) {
      System.out.println("测试成功");
    } else {
      System.out.println("测试失败");
    }
  }

}
