package demo;

public class BorrowWithExtension extends BorrowBook {
    public BorrowWithExtension(Book book) {
        super(book);
    }

    @Override
    public void borrow() {
        book.read();
        System.out.println("Borrowed with an extension.");
    }
}
