/**
 * @author duanyupeng
 * @date 2025年7月14日
 */
package com.fengfortitude.basic;
// 要去/demo/target/classes目录下执行java com.example.CommandLineParameters -version
public class CommandLineParameters {
  public static void main(String[] args) {
    for (String arg : args) {
      if ("-version".equals(arg)) {
        System.out.println("v 1.0");
        break;
      }
    }
  }
}
