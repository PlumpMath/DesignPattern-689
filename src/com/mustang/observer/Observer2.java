package com.mustang.observer;

/**
 * Desc
 * Created by Mustang on 17/2/27.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 received");
    }
}
