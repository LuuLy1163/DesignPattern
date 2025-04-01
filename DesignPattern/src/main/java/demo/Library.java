package demo;

import java.util.ArrayList;
import java.util.List;

// Observable - Thư viện sẽ thông báo cho các Observer
public class Library {
    private static Library instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>(); // Danh sách observer

    // Private constructor để đảm bảo chỉ có một instance duy nhất
    private Library() {}

    // Lấy instance duy nhất của Library (Singleton)
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // Thêm Observer (User hoặc các Observer khác)
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Gỡ bỏ Observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Thông báo tất cả các Observer khi có thay đổi
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Thêm sách vào thư viện và thông báo cho các Observer
    public void addBook(Book book) {
        books.add(book);
        notifyObservers("New book added: " + book.title);
    }

    // Trả sách và thông báo cho các Observer
    public void returnBook(Book book) {
        books.remove(book);
        notifyObservers("Book returned: " + book.title);
    }

    // Lấy danh sách sách trong thư viện
    public List<Book> getBooks() {
        return books;
    }
}
