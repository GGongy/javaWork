package day1010;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Go","a",20.0);
        System.out.println(book.getTitel());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
    }
}
