package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 */
public class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("默认骑马");
    }
}
