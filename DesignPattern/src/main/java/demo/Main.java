package demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        Library library = Library.getInstance();

        // Factory Method Pattern: tạo các loại sách khác nhau
        Book paperBook = BookFactory.createBook("Paper", "Java Basics", "John Doe", "Programming");
        Book eBook = BookFactory.createBook("EBook", "Spring Framework", "Jane Doe", "Programming");

        library.addBook(paperBook);
        library.addBook(eBook);

        // Strategy Pattern: tìm kiếm sách
        SearchContext searchContext = new SearchContext();

        searchContext.setSearchStrategy(new SearchByName());
        List<Book> result = searchContext.executeSearch("Java", library.getBooks());
        result.forEach(book -> System.out.println("Found by Name: " + book.title));

        // Observer Pattern: thêm người dùng theo dõi thư viện
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        library.addObserver(user1);
        library.addObserver(user2);

        // Thông báo cho người dùng khi có sách mới
        library.addBook(new PaperBook("Design Patterns", "Erich Gamma", "Programming"));

        // Decorator Pattern: mượn sách với các tính năng bổ sung
        BorrowBook borrowWithExtension = new BorrowWithExtension(paperBook);
        borrowWithExtension.borrow();

        BorrowBook borrowSpecialVersion = new BorrowSpecialVersion(eBook);
        borrowSpecialVersion.borrow();
    }
}

