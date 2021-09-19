package com.vendingMachine.enums;

/**
 * Product enum is used to define the different products available  Vending Machine
 * @author AVINASH
 */
public enum Product {

	// Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
	// Allow user to select products Coke(25), Pepsi(35), Soda(45)

	COKE(1, 25), PEPSI(2, 35), SODA(3, 45);

	private int id;
	private int price;

	Product(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static Product valueOf(int productSelected) {
		for(Product product: Product.values()) {
			if (productSelected == product.getId()) {
				return product;
			}
		}
		return null;
	}

}
