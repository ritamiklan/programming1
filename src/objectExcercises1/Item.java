package objectExcercises1;

public class Item {

	private Product product;
	private int quantity;

	public Item(Product product, int quantity) {

		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getSubtotal() {

		double subtotal = quantity * product.getPrice();

		return subtotal;
	}
}