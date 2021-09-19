package com.vendingMachine.input;

import java.util.Scanner;

import com.vendingMachine.enums.Coin;

/**
 * InputData class reads the console input 
 * @author AVINASH
 */
public class InputData {

	public int getProductInput(Scanner scanner) {
		int value;
		while (true) {
			try {
				value = Integer.parseInt(scanner.nextLine());
				if (value > 0 && value < 4) {
					System.out.println("The input is: " + value);
					break;
				}
				// not positive
				System.out.print("Please print a POSITIVE integer (1,2,3): ");
			} catch (NumberFormatException e) {
				System.out.print("Please enter an integer value: ");
			}
		}
		return value;
	}
	
	public int[] getEnterCoin(Scanner scanner) {
		int[] enteredCoins;
		while (true) {
			try {
				String userEnteredCoins = scanner.nextLine();
				enteredCoins = Coin.parseCoins(userEnteredCoins);
				if (enteredCoins.length == 4) {
					break;
				}
				System.out.print("Please enter valid input of size 4: ");
			} catch (NumberFormatException e) {
				System.out.print("Please enter proper integer values: ");
			}
		}
		return enteredCoins;
	}
}
