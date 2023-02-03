package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 */
public class VehiclesFactory {
    public static Horse horse=new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){return new Plane();}
}
