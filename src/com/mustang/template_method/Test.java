package com.mustang.template_method;

/**
 * 调用AbstractCalculator类里的calculate(String,String)方法，
 * 在calculate(String,String)里调用同类的split()，
 * 之后再调用calculate(int ,int)方法，从这个方法进入到子类中，
 * 执行完return num1 + num2后，将值返回到AbstractCalculator类，赋给result，打印出来。
 * Created by Mustang on 17/2/24.
 */
public class Test {

    public static void main(String[] args) {
        AbstractCalculator calculator = new Plus();

        System.out.println(calculator.calculate("5+2","\\+"));
    }

}
