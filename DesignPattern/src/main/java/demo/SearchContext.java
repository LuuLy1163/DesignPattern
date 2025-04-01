package demo;

import java.util.List;

//Context to use Strategy
class SearchContext {
private SearchStrategy strategy;

public void setSearchStrategy(SearchStrategy strategy) {
   this.strategy = strategy;
}

public List<Book> executeSearch(String query, List<Book> books) {
   return strategy.search(query, books);
}
}