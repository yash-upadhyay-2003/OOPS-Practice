package LibraryManagementSystem;

public class Reader {
   String readerName;

    public String getReaderName() {
        return readerName;
    }

    Reader(String readerName){
       this.readerName = readerName;
   }
   void readBook(Book book){
    book.read();
   }
}
