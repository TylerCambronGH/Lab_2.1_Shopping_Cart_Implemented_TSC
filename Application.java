/**
 * @author tylercambron
 * @ To present the Shopping Cart ADT
 */
public class Application {
	public static void main(String[] args) {
		MyCart myShoppingCart = new MyCart();
		// Cart Items
		CartItem shoes = new CartItem("Shoes", 50.0);
		CartItem shirt = new CartItem("Shirt", 25.5);
		CartItem pants = new CartItem("Pants", 36.7);
		CartItem football = new CartItem("Football", 22.2);
		CartItem pencils = new CartItem("Pencils", 5.2);
		
		myShoppingCart.addItem(shoes);
		myShoppingCart.addItem(shirt);
		myShoppingCart.addItem(pants);
		myShoppingCart.addItem(pants);
		System.out.println("Pants Amount: " + myShoppingCart.getAmountOfItem(pants));
		myShoppingCart.removeItem(pants);
		System.out.println("Pants Amount: " + myShoppingCart.getAmountOfItem(pants));
		myShoppingCart.addItem(football);
		myShoppingCart.addItem(pencils);
		myShoppingCart.show();
		System.out.println("Removing clothes...");
		myShoppingCart.removeItem(shoes);
		myShoppingCart.removeItem(shirt);
		myShoppingCart.removeItem(pants);
		myShoppingCart.show();
		System.out.println("Cleared? " + myShoppingCart.isEmpty());
		System.out.println("Clearing...");
		myShoppingCart.empty();
		System.out.println("Cleared? " + myShoppingCart.isEmpty());
		myShoppingCart.show();
	}
}
