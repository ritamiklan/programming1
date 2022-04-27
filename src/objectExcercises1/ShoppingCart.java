package objectExcercises1;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class ShoppingCart {

	DecimalFormat twoDecimals = new DecimalFormat("0.00");

	private ArrayList<Item> itemList;

	public ShoppingCart() {

		itemList = new ArrayList<Item>();
	}

	public void add(Product product, int quantity) {

		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {

		for (Item itemObject : itemList) {

			if (itemObject.getProduct() == product) {

				itemList.remove(itemObject);
			}
		}
	}

	public double getTotalPrice() {

		double total = 0;

		for (Item itemObject : itemList) {

			total += itemObject.getSubtotal();
		}

		return total;
	}

	public String toString() {

		String empty = "There are no items in the shopping cart. \n";

		String blah = "";

		if (itemList.isEmpty()) {

			return empty;

		} else {

			for (Item itemObject : itemList) {

				blah += itemObject.getProduct().getProductNumber() + ": " + itemObject.getProduct().getName()
						+ ", quantity: " + itemObject.getQuantity() + ", unit price: "
						+ twoDecimals.format(itemObject.getProduct().getPrice()) + ", subtotal: "
						+ twoDecimals.format(itemObject.getSubtotal()) + "\n";

			}

			return "=== Shopping cart === \n" + blah + "TOTAL PRICE: " + twoDecimals.format(getTotalPrice())
					+ " euros \n";

		}

	}
}
