package demo;

import java.util.List;
import java.util.stream.Collectors;

//Concrete Strategy for Search by Category
class SearchByCategory implements SearchStrategy {
@Override
public List<Book> search(String query, List<Book> books) {
   return books.stream()
           .filter(book -> book.category.contains(query))
           .collect(Collectors.toList());
}
}
