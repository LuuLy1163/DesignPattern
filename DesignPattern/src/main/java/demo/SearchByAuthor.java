package demo;

import java.util.List;
import java.util.stream.Collectors;

//Concrete Strategy for Search by Author
class SearchByAuthor implements SearchStrategy {
@Override
public List<Book> search(String query, List<Book> books) {
   return books.stream()
           .filter(book -> book.author.contains(query))
           .collect(Collectors.toList());
}
}
