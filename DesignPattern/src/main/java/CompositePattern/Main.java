package CompositePattern;

public class Main {
    public static void main(String[] args) {

        Product coffee = new Product("Cà phê", 30);
        Product tea = new Product("Trà", 25);
        Product water = new Product("Nước suối", 10);

        Table table1 = new Table();
        table1.addProduct(coffee);
        table1.addProduct(tea);


        Table table2 = new Table();
        table2.addProduct(tea);
        table2.addProduct(water);

        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        System.out.println("Tổng doanh thu của quán: " + coffeeShop.getTotalRevenue() + " VND");
    }
}
