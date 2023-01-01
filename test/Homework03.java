package test;

public class Homework03 {
    public static void main(String[] args) {
        Book b=new Book("三国演义",122);
        b.updatePrice(b);
        System.out.println(b.price);


    }

}
class Book{
    String name;
    double price;
    public Book(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void updatePrice(Book B){
        if (B.price>150){
            this.price=150;
        } else if (B.price > 100) {
            this.price=100;
        }
    }
}
