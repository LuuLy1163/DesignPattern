package CompositePattern;

public class Product implements Component {
 private String name;
 private double price;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 @Override
 public double getTotalPrice() {
     return price;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }
}

