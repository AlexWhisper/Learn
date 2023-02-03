package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;
    //有参构造器，输入名字和一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        if (!(vehicles instanceof Boat))
            vehicles=VehiclesFactory.getBoat();
        //确保vehicles是Boat
        vehicles.work();
    }
    public void comm(){
        if (!(vehicles instanceof Horse))
            vehicles=VehiclesFactory.getHorse();
        vehicles.work();
    }

    public void fly(){
        if (!(vehicles instanceof Plane)){
            vehicles=VehiclesFactory.getPlane();
        }
        vehicles.work();
    }


}
