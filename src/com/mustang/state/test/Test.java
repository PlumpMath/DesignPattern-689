package com.mustang.state.test;

import com.mustang.state.context.Context;
import com.mustang.state.state.impl.RedState;

/**
 * Desc
 * Created by Mustang on 17/1/22.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Context c = new Context(new RedState());
        while (true) {
            System.out.println("当前状态："+c.getState().getState());
            System.out.println("上一个状态: "+c.push());
            Thread.currentThread().sleep(2000);
        }
    }

}
