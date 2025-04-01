package demo;

import java.util.List;
import java.util.stream.Collectors;

//Strategy Interface
interface SearchStrategy {
 List<Book> search(String query, List<Book> books);
}

