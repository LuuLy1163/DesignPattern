package demo;

public class BorrowSpecialVersion extends BorrowBook {
    public BorrowSpecialVersion(Book book) {
        super(book);
    }

    @Override
    public void borrow() {
        book.read();
        System.out.println("Borrowed with a special version (e.g., braille).");
    }
}
