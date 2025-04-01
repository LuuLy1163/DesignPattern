package demo;

import java.util.List;
import java.util.stream.Collectors;

//Concrete Strategy for Search by Name
class SearchByName implements SearchStrategy {
@Override
public List<Book> search(String query, List<Book> books) {
   return books.stream()
           .filter(book -> book.title.contains(query))
           .collect(Collectors.toList());
}
}