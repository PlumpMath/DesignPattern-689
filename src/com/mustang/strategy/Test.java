package com.mustang.strategy;

/**
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 * Created by Mustang on 17/2/21.
 */
public class Test {

    public static void main(String[] args) {
        ICalculator calculator = new Plus();
        System.out.println(calculator.calculator("2+3"));
    }

}