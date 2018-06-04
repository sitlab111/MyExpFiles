package com.rajks.chainOfResp;
/**
 * We need to create different processor classes that will implement the DispenseChain interface
 * and provide implementation of dispense methods. Since we are developing our system to work with
 * three types of currency bills – 50$, 20$ and 10$, we will create three concrete implementations.
 * @author rsomashekarappa
 *
 */

public class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	public void setNextChain(DispenseChain nxChain) {
		this.chain = nxChain;
	}

	public void dispense(Currency cur) {
		if(cur.getAmount() >= 50) {
			int num = cur.getAmount()/50;
			int rem = cur.getAmount() % 50;
			System.out.println("Dispending: " +num + " 50$ note");
			if(rem != 0)
				this.dispense(new Currency(rem));
		} else {
			this.chain.dispense(cur);
		}

	}

}
