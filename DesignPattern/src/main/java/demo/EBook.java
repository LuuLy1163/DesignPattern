package demo;


class EBook extends Book {
 public EBook(String title, String author, String category) {
     super(title, author, category);
 }

 @Override
 public void read() {
     System.out.println("Reading e-book: " + title);
 }
}
