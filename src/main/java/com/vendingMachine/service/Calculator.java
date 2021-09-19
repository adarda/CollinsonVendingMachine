package com.vendingMachine.service;

import com.vendingMachine.beans.CoinBundle;

public interface Calculator {

	int calculateTotal(CoinBundle enteredCoins);
	CoinBundle calculateChange(int amountMoneyToReturn);
}
