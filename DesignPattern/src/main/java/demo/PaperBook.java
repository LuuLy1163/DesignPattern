package demo;

//Concrete classes for different types of Books
public class PaperBook extends Book {
public PaperBook(String title, String author, String category) {
   super(title, author, category);
}

@Override
public void read() {
   System.out.println("Reading paper book: " + title);
}
}