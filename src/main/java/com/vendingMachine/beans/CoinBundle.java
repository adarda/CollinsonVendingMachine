package com.vendingMachine.beans;

/**
 * CoinBundle class is used to is used to calculate the total amount received from the user to purchase a product
 * @author AVINASH
 */
public class CoinBundle {
	
	public int number1CentsCoins;
	public int number5CentsCoins;
	public int number10CentsCoins;
	public int number25CentsCoins;
	
	public CoinBundle(int[] enteredCoins) {
		this.number1CentsCoins = enteredCoins[0];
		this.number5CentsCoins = enteredCoins[1];
		this.number10CentsCoins = enteredCoins[2];
		this.number25CentsCoins = enteredCoins[3];
	}
	
	public int getNumber1CentsCoins() {
		return number1CentsCoins;
	}

	public void setNumber1CentsCoins(int number1CentsCoins) {
		this.number1CentsCoins = number1CentsCoins;
	}

	public int getNumber5CentsCoins() {
		return number5CentsCoins;
	}

	public void setNumber5CentsCoins(int number5CentsCoins) {
		this.number5CentsCoins = number5CentsCoins;
	}

	public int getNumber10CentsCoins() {
		return number10CentsCoins;
	}

	public void setNumber10CentsCoins(int number10CentsCoins) {
		this.number10CentsCoins = number10CentsCoins;
	}

	public int getNumber25CentsCoins() {
		return number25CentsCoins;
	}

	public void setNumber25CentsCoins(int number25CentsCoins) {
		this.number25CentsCoins = number25CentsCoins;
	}
	
	public int getTotal() {
		int total = 0;
		total = total + this.number1CentsCoins*1;
		total = total + this.number5CentsCoins*5;
		total = total + this.number10CentsCoins*10;
		total = total + this.number25CentsCoins*25;
		return total;
	}
	
}
