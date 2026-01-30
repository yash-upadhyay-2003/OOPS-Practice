package LibraryManagementSystem;

public class EBook extends Book {
    String fileFormat;
    EBook(String fileFormat,String title,Author author){
        super(title,author);
        this.fileFormat = fileFormat;
    }
}
