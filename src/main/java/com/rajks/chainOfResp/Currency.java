/**
 * One of the great example of Chain of Responsibility pattern is ATM Dispense machine. 
 * The user enters the amount to be dispensed and the machine dispense amount in terms of defined
 *  currency bills such as 50$, 20$, 10$ etc.If the user enters an amount that is not multiples of 10, it throws error. 
 *  
 *  We can create a class Currency that will store the amount to dispense and used by the chain implementations.
 */

package com.rajks.chainOfResp;

public class Currency {
	private int amount;

	public Currency(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}

}
