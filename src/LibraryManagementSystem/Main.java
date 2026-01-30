package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Padhaku Adda");

        library.addBook(new Book("Rich Dad", new Author("Yash Upadhyay")));
        library.showBooks();

        EBook fictional = new EBook("pdf", "Rich Dad", new Author("Yash Upadhyay"));

        library.addBook(fictional);
        library.showBooks();
    }
}
