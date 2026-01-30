package LibraryManagementSystem;

import InterfacePractice.Payment;

public class Book implements Readable{
   private String title;
   private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void read(){
        System.out.println("This book is: " + title + " by " + author);
    }

    public String getTitle() {
        return title;
    }
}
