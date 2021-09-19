package com.vendingMachine.exception;

/**
 * InsufficentAmountException is a user defined exception which comes into picture when a user provides insufficient amount to purchase a item
 * @author AVINASH
 */
public class InsufficentAmountException extends Exception {
	
	private static final long serialVersionUID = 3865208236570942421L;
	String str;
	public InsufficentAmountException(String str1) {
		str = str1;
	}
	@Override
	public String toString() {
		return "InsufficentAmoutException [str=" + str + "]";
	}
	
}
