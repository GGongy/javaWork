package day1010;

public class Book {
    private String titel;
    private String author;
    private double price;
    public Book(String titel, String author, double price){
        this.titel = titel;
        this.author = author;
        this.price = price;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
