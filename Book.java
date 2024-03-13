package Assignment;

import java.util.ArrayList;

class Book1 {

    int bookId;
    String bookName;
    String authorName;

    Book1(int bookId, String bookName, String authorName) {
        System.out.println(bookId + "" + bookName + "" + authorName);
    }

    public String toString() {
        return bookId + " " + bookName + " " + authorName;
    }
}

public class Book {
    public static void main(String[] args) {
        ArrayList<Book1> list = new ArrayList<Book1>();

        list.add(new Book1(10, "BookName", " html"));
        list.add(new Book1(11, "BookName", " Css"));
        list.add(new Book1(12, "BookName", " java"));
        list.add(new Book1(13, "BookName", "C++"));
        // System.out.println();
    }

}
