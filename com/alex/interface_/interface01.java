package com.alex.interface_;

public class interface01 {
    public static void main(String[] args) {
//        phone phone = new phone();
//        camera camera = new camera();
//        Computer computer = new Computer();
//        computer.work(phone);
//        computer.work(camera);

        UsbInterface[] usbInterfaces=new UsbInterface[2];
        usbInterfaces[0]=new phone();
        usbInterfaces[1]=new camera();

        for (int i = 0; i < usbInterfaces.length; i++) {
            usbInterfaces[i].start();
            usbInterfaces[i].stop();
            if (usbInterfaces[i] instanceof phone){
                ((phone) usbInterfaces[i]).call();
            }
        }
        

    }
}
