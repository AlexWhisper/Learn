package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 */
public class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("遇河开船");
    }
}
