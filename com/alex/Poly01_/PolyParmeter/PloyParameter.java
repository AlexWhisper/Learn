package com.alex.Poly01_.PolyParmeter;

public class PloyParameter {
    public static void main(String[] args) {
        PloyParameter ployParameter = new PloyParameter();

        Worker tom = new Worker("tom", 2500);
        ployParameter.showEmpAnnual(tom);
        ployParameter.testWork(tom);


        Manger milan = new Manger("milan", 2500, 100);
        ployParameter.showEmpAnnual(milan);
        ployParameter.testWork(milan);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if (e instanceof Manger){
            ((Manger) e).manage();
        }else if (e instanceof Worker){
            ((Worker) e).work();
        }
        "nane ".equals("hello");

    }
}
