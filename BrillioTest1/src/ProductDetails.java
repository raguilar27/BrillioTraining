import java.util.*;
import java.util.stream.*;

class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}

public class ProductDetails {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Bottle", 5));
		products.add(new Product("Bag", 10));
		products.add(new Product("Pen", 1));
		products.add(new Product("Phone", 40));
		
		products.stream().filter(product -> product.getPrice() == 10).forEach(System.out::println);
		
	}
}