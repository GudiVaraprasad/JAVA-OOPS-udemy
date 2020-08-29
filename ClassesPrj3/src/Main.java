import java.util.LinkedList;

class ShoppingCart {
	
	private LinkedList products = new LinkedList();
	
	public void addToCart(String product) {
		products.add(product);
	}
	
	public void order() {
		System.out.println("Ordered Products");
		System.out.println(products);
	}
}


public class Main {

	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		
		cart1.addToCart("a");
		cart1.addToCart("b");
		cart1.addToCart("c");
		
		cart1.order();
	}

}
