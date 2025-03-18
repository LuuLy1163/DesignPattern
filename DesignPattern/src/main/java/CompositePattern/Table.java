package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements Component {
    private List<Component> products = new ArrayList<>();

    public void addProduct(Component product) {
        products.add(product); 
    }

    @Override
    public double getTotalPrice() {
        double total = 0;
        for (Component product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }
}

