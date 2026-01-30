package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List<Book> books;
    Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book){
        books.add(book);
    }
    public void showBooks(){
        for(Book book : books){
            System.out.println(book.getTitle());
        }
    }

}
