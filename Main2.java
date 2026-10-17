class Book{
    public String title;
    public String author;
    private double price;
    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void applyDiscount(double percentage){
        if(percentage > 0 && percentage <= 100){
            price = price - (price * percentage / 100);

        }
        else{
            System.out.println("invalid discout");
        }
    }
}
public class Main2{
    public static void main(String[] args){
        Book b1 = new Book("javaa basics","alice",500);
        // Access public fields
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);

        // Access private field using getter
        System.out.println("Price: " + b1.getPrice());

        // Apply discount
        b1.applyDiscount(10); // 10% off
        System.out.println("Price after discount: " + b1.getPrice());

    }
}