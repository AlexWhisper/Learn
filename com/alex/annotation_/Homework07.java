package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 * 有一个Car类，有属性temperature(温度)，车内有Air(空调)类，有吹风的功能flow,
Ai会监视车内的温度，如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之
间则关掉空调。实例化具有不同温度的C对象，调用空调的flow方法，测试空调吹的风是否
正确
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(10);
        Car car1 = new Car(-1);
        Car car2 = new Car(90);
        car.getAir().flow();
        car2.getAir().flow();
        car1.getAir().flow();

    }
}
class Car {
    double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        void flow(){
            if (temperature>40){
                System.out.println("吹冷气");
            } else if (temperature<0) {
                System.out.println("吹暖气");
            }else {
                System.out.println("不吹");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }


}
