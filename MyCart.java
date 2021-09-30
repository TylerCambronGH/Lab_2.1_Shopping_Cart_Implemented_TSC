
public class MyCart implements ShoppingCart {

	private ArrayBag<CartItem> myCart;
	
	public MyCart() {
		myCart = new ArrayBag<CartItem>();
	}
	
	@Override
	public void empty() {
		myCart.clear();
		
	}

	@Override
	public boolean isEmpty() {
		return myCart.isEmpty();
	}

	@Override
	public void addItem(CartItem item) {
		myCart.add(item);
	}

	@Override
	public void removeItem(CartItem item) {
		myCart.remove(item);
	}

	@Override
	public CartItem getItem(int index) {
		return this.toArray()[index];
	}

	@Override
	public int getAmountOfItem(CartItem item) {
		return myCart.getFrequencyOf(item);
	}

	@Override
	public double getTotalPrice() {
		double totalPrice = 0;
		for (CartItem cartItem: this.toArray()) {
			totalPrice += cartItem.getPrice();
		}
		return totalPrice;
	}

	@Override
	public CartItem[] toArray() {
		Object[] objects = myCart.toArray();
		CartItem[] cartItems = new CartItem[myCart.getCurrentSize()];
		int index = 0;
		for (Object o: objects) {
			cartItems[index] = (CartItem) o;
			index++;
		}
		return cartItems;
	}
	
	public void show() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		sb.append("\nMy Cart\n----------------------\n");
		for (CartItem cI: this.toArray()) {
			sb.append("Index: " + i + " | Name: " + cI.getName() + " | Price: " + cI.getPrice()+"\n");
			i++;
		}
		sb.append("\nTotal Price: $" + this.getTotalPrice() + "\n");
		System.out.println(sb.toString());
	}
}
