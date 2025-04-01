package demo;




class AudioBook extends Book {
 public AudioBook(String title, String author, String category) {
     super(title, author, category);
 }

 @Override
 public void read() {
     System.out.println("Listening to audiobook: " + title);
 }
}
