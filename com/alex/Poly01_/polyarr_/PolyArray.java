package com.alex.Poly01_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] person=new Person[5];
        person[0]=new Person("jack",20);
        person[1]=new Student("Alex",23,100);
        person[2]=new Student("Tom",22,90);
        person[3]=new Teacher("Kai",22,10000);
        person[4]=new Teacher("Ross",22,12000);

        for (int i = 0; i < person.length; i++) {
            System.out.print(person[i].say());
            if (person[i] instanceof Student) {

                System.out.print(((Student) person[i]).study());
            }if (person[i] instanceof Teacher) {
                System.out.print(((Teacher) person[i]).teach());
            }
            System.out.println();

        }
//        Student s = (Student) person[1];
//        Teacher t=(Teacher) person[3];
//        System.out.println(s.study());
//        System.out.println(t.teach());

    }
}
