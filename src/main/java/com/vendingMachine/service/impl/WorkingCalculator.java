package com.vendingMachine.service.impl;

import com.vendingMachine.beans.CoinBundle;
import com.vendingMachine.enums.Coin;
import com.vendingMachine.service.Calculator;

/**
 * WorkingCalculator class is used to calculate the amount to returned to the user when surplus amount is provided to purchase a item
 * @author AVINASH
 */
public class WorkingCalculator implements Calculator {

	public int calculateTotal(CoinBundle enteredCoins) {
		return enteredCoins.getTotal();
	}

	public CoinBundle calculateChange(int amountMoneyToReturn) {
		CoinBundle change = new CoinBundle(new int[4]);
		int remainingAmount = amountMoneyToReturn;
		change.number25CentsCoins = remainingAmount / Coin.QUARTER.getValue();
		remainingAmount = remainingAmount % Coin.QUARTER.getValue();

		change.number10CentsCoins = remainingAmount / Coin.DIME.getValue();
		remainingAmount = remainingAmount % Coin.DIME.getValue();

		change.number5CentsCoins = remainingAmount / Coin.NICKEL.getValue();
		remainingAmount = remainingAmount % Coin.NICKEL.getValue();

		change.number1CentsCoins = remainingAmount / Coin.PENNY.getValue();

		return change;
	}

}
