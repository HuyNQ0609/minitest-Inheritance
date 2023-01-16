package run;

import books.BookManager;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.display();
        bookManager.menu();
    }
}