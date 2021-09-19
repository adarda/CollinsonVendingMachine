package com.vendingMachine.service;

import com.vendingMachine.exception.InsufficentAmountException;

public interface VendingMachine {

	void displayProductsMessage();

	void selectProduct(int product);

	void displayEnterCoinsMessage();

	void enterCoins(int[] coins) throws InsufficentAmountException;

	void displayChangeMessage();
}
