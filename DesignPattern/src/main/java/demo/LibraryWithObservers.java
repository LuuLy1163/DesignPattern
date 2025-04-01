package demo;

import java.util.ArrayList;
import java.util.List;

//Observable - Library class that notifies observers
class LibraryWithObservers {
 private List<Observer> observers = new ArrayList<>();
 private List<Book> books = new ArrayList<>();

 // Add observer
 public void addObserver(Observer observer) {
     observers.add(observer);
 }

 // Remove observer
 public void removeObserver(Observer observer) {
     observers.remove(observer);
 }

 // Notify all observers
 public void notifyObservers(String message) {
     for (Observer observer : observers) {
         observer.update(message);
     }
 }

 // Add a new book and notify
 public void addBook(Book book) {
     books.add(book);
     notifyObservers("New book added: " + book.title);
 }

 // Return book and notify
 public void returnBook(Book book) {
     books.remove(book);
     notifyObservers("Book returned: " + book.title);
 }
}