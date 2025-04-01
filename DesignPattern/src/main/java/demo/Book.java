package demo;

//Abstract class for Book
abstract class Book {
 protected String title;
 protected String author;
 protected String category;

 public Book(String title, String author, String category) {
     this.title = title;
     this.author = author;
     this.category = category;
 }

 public abstract void read();
}
