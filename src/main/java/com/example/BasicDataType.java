/**
 * @author duanyupeng
 * @date 2025年7月06日
 */
package com.example;

public class BasicDataType {
    public static void main(String[] args) {
        // 基本数据类型

        // 布尔类型
        boolean flag = true;
        System.out.println("flag的值是：" + flag);
        // 整数类型
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("int 类型的范围是：" + min + " 到 " + max);
        long a = 10L;
        System.out.println("long 的值是：" + a);
        short b = 10;
        System.out.println("short 的值是：" + b);
        // 浮点数类型
        double c = 10.0;
        System.out.println("double 的值是：" + c);
        float d = 10.0f;
        System.out.println("float 的值是：" + d);
        // 字符类型
        char g = 'a';
        System.out.println("char 的值是：" + g);
        
        // 强制类型转换
        int value_int = 65;
        char value_char = (char) value_int;
        System.out.println("value_char 的值是：" + value_char);

        // 包装器类型
        Integer value_Integer = new Integer(10);
        System.out.println("value_Integer 的值是：" + value_Integer);
        // 自动装箱
        Integer value_Integer2 = 10;
        System.out.println("value_Integer2 的值是：" + value_Integer2);
        // 自动拆箱
        int value_int2 = value_Integer2;
        System.out.println("value_int2 的值是：" + value_int2);

        // 将字符串转为整型
        String value_string = "123";
        int value_int3 = Integer.parseInt(value_string);
        System.out.println("value_int3 的值是：" + value_int3);

        // 使用Character包装器类型
        Character value_Character = new Character('a');
        System.out.println("value_Character 的值是：" + value_Character);

        // 检查字符是否为数字
        char testChar = '9';
        if(Character.isDigit(testChar)) {
            System.out.println("testChar 是数字");
        }

        // 检查字符是否为字母
    }
}
