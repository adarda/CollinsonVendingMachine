package com.vendingMachine.service.impl;

import com.vendingMachine.beans.CoinBundle;
import com.vendingMachine.enums.Product;
import com.vendingMachine.exception.InsufficentAmountException;
import com.vendingMachine.service.Calculator;
import com.vendingMachine.service.VendingMachine;

/**
 * WorkingVendingMachine class is used to the introduction messages which appear when the user starts using the vending machine
 * @author AVINASH
 */
public class WorkingVendingMachine implements VendingMachine {
	private int selectedProduct;
	private CoinBundle change;

	public void displayProductsMessage() {
		System.out.println("========================================");
		System.out.println(" Welcome to Collinson Vending Machine ");
		System.out.println("========================================");
		System.out.println("                                       ");
		System.out.println("Products Available:");
		System.out.println("                                       ");
		for (Product product : Product.values()) {
			System.out.println(
					"" + product.getId() + ") " + product.name() + " -Price: " + product.getPrice() + " cents");
		}
		System.out.println("                                       ");
		System.out.println("Please Select your Product:");

	}

	public void selectProduct(int product) {
		this.selectedProduct = product;

	}

	public void displayEnterCoinsMessage() {
		System.out.println("                                              ");
		System.out.println("Please enter coins as follows: ");
		System.out.println("num of 1 cents coins,num of 5 cents coins,num of 10 cents coins,num of 25 cents coins ");
		System.out.println("                                              ");
		System.out.println("Example: If you would like to enter 2 ten cents coins: 0,0,2,0");
		System.out.println("Plese enter coins:");
	}

	public void enterCoins(int[] coins) throws InsufficentAmountException {
		Calculator calculator = new WorkingCalculator();
		Product product = Product.valueOf(this.selectedProduct);
		int total = calculator.calculateTotal(new CoinBundle(coins));
		int changeAmount = total - product.getPrice();
		if (changeAmount < 0) {
			throw new InsufficentAmountException("Insufficent Amount to buy the product.Program terminated.");
		}
		this.change = calculator.calculateChange(changeAmount);
	}

	public void displayChangeMessage() {
		System.out.println("                                              ");
		System.out.println("Your change is :" + change.getTotal() + "cents splitted as follows: ");
		System.out.println("    25 cents coins: " + change.number25CentsCoins);
		System.out.println("    10 cents coins: " + change.number10CentsCoins);
		System.out.println("    5 cents coins: " + change.number5CentsCoins);
		System.out.println("    1 cents coins: " + change.number1CentsCoins);

	}

}
