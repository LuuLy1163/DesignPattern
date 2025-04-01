package demo;

class BookFactory {
public static Book createBook(String type, String title, String author, String category) {
   switch (type) {
       case "Paper":
           return new PaperBook(title, author, category);
       case "EBook":
           return new EBook(title, author, category);
       case "Audio":
           return new AudioBook(title, author, category);
       default:
           throw new IllegalArgumentException("Unknown book type");
   }
}
}

