package com.vendingMachine.enums;

/**
 * Coin enum is used to define the different coins and their values used in the Vending Machine
 * @author AVINASH
 */
public enum Coin {

//	Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

	private int value;

	private Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static int[] parseCoins(String coins) {
		String[] numberCoinsInText = coins.split(",");
		int[] result = new int[numberCoinsInText.length];
		
		for (int index = 0; index < numberCoinsInText.length; index++) {
			result[index] = Integer.parseInt(numberCoinsInText[index]);
		}
	
		return result;
	}

}
