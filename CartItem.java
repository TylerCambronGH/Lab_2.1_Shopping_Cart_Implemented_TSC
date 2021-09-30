/**
 * @author tylercambron
 * Cart Item used in shopping cart methods.
 */
public class CartItem {
	/**
	 * Name of the item.
	 */
	private String name = "";
	/**
	 * Price of the item.
	 */
	private double price = 0.0;
	
	public CartItem(String name, double price) {
		setName(name);
		setPrice(price);
	}
	
	/**
	 * @return returns String variable name
	 */
	public String getName() {
		return name;
	};
	
	/**
	 * @return Double value price of the cart item.
	 */
	public double getPrice() {
		return price;
	};
	
	/**
	 * Set String variable name.
	 * @param name used to describe the cart item.
	 */
	public void setName(String name) {
		this.name = name;
	};
	
	/**
	 * Set double variable price.
	 * @param price used to describe the expense of the cart item.
	 */
	public void setPrice(double price) {
		this.price = price;
	};
}
