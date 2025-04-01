package demo;

public abstract class BorrowBook {
    protected Book book;

    public BorrowBook(Book book) {
        this.book = book;
    }

    public abstract void borrow();
}
