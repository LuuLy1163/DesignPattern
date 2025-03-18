package CompositePattern;

import java.util.ArrayList;
import java.util.List;
public class CoffeeShop {
    private List<Table> tables = new ArrayList<>();

    public void addTable(Table table) {
        tables.add(table);
    }

    public double getTotalRevenue() {
        double total = 0;
        for (Table table : tables) {
            total += table.getTotalPrice();
        }
        return total;
    }
}

