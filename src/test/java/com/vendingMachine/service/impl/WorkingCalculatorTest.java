package com.vendingMachine.service.impl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.vendingMachine.beans.CoinBundle;
import com.vendingMachine.service.Calculator;

public class WorkingCalculatorTest {

	private Calculator workingCalculator;

	@Before
	public void setUp() throws Exception {
		this.workingCalculator = new WorkingCalculator();
	}

	@After
	public void tearDown() throws Exception {
		this.workingCalculator = null;
	}

	@Test
	public void testCalculateTotal() {
		int[] enteredCoins = new int[] {1,2,3,4};
		CoinBundle coinBundle = new CoinBundle(enteredCoins) ;
		int total = workingCalculator.calculateTotal(coinBundle);
		Assert.assertEquals("Expected and actual total of Coins not macthed", 141, total);
	}

	@Test
	public void testCalculateTotalFailure() {
		int[] enteredCoins = new int[] {1,2,3,4};
		CoinBundle coinBundle = new CoinBundle(enteredCoins) ;
		int total = workingCalculator.calculateTotal(coinBundle);
		Assert.assertNotEquals("Actual total of Coins is other than 141", 140, total);
	}

	@Test
	public void testCalculateChange() {
		CoinBundle coinBundle=workingCalculator.calculateChange(50);
		Assert.assertEquals("Expected and actual total of change amount for 1Cent not macthed", 0, coinBundle.getNumber1CentsCoins());
		Assert.assertEquals("Expected and actual total of change amount for 5Cent not macthed", 0, coinBundle.getNumber5CentsCoins());
		Assert.assertEquals("Expected and actual total of change amount for 10Cent not macthed", 0, coinBundle.getNumber10CentsCoins());
		Assert.assertEquals("Expected and actual total of change amount for 25Cent not macthed", 2, coinBundle.getNumber25CentsCoins());
	}

}
