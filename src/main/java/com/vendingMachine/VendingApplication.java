package com.vendingMachine;

import java.util.Scanner;

import com.vendingMachine.exception.InsufficentAmountException;
import com.vendingMachine.input.InputData;
import com.vendingMachine.service.VendingMachine;
import com.vendingMachine.service.impl.WorkingVendingMachine;

/**
 * VendingApplication class is the main class for the application
 * @author AVINASH
 */
public class VendingApplication {
	public static InputData inputData = new InputData();

	public static void main(String[] args) {
		actionMethod(args);
	}

	public static VendingMachine actionMethod(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VendingMachine vendingMachine = new WorkingVendingMachine();
		vendingMachine.displayProductsMessage();

		int value = inputData.getProductInput(scanner);
		vendingMachine.selectProduct(value);
		vendingMachine.displayEnterCoinsMessage();

		int[] enteredCoins = inputData.getEnterCoin(scanner);
		try {
			vendingMachine.enterCoins(enteredCoins);
			vendingMachine.displayChangeMessage();
			scanner.close();
		} catch (InsufficentAmountException e) {
			System.out.println(e);
		}
		return vendingMachine;
	}
}
