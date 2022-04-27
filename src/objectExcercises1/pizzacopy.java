package objectExcercises1;

import java.text.DecimalFormat;

public class pizzacopy {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		private String name;
		private double price;
		public pizzacopy(String name, double price) {
			
			this.name = name;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public double getPrice() {
			return price;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(double price) {
			this.price = price;
		}

		
		
		
	
}


