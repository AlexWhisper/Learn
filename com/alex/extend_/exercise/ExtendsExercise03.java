package com.alex.extend_.exercise;

public class ExtendsExercise03 {

}
class Computer{
    private String cpu;
    private String mem;
    private String disk;

    public Computer(String cpu, String mem, String disk) {
        this.cpu = cpu;
        this.mem = mem;
        this.disk = disk;
    }

    public String getDetails(){
        return cpu+mem+disk;
    }
}
class pc extends Computer{
    private String brand;

    public pc(String cpu, String mem, String disk,String brand) {
        super(cpu, mem, disk);
        this.brand=brand;
    }
    public void printinfo(){
        System.out.println(this.getDetails()+brand);
    }

}

class notePad extends Computer{

    private String color;

    public notePad(String cpu, String mem, String disk,String color) {
        super(cpu, mem, disk);
        this.color=color;
    }
    public void printinfo(){
        System.out.println(this.getDetails()+color);
    }
}
class test{
    public static void main(String[] args) {
        pc p1 = new pc("i7","16GB","1TB","华为");
        notePad n1 = new notePad("i5","8GB","128GB","红色");
        p1.printinfo();
        n1.printinfo();
    }
}

