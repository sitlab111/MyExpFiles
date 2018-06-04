package com.rajks.chainOfResp;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;

	public void setNextChain(DispenseChain nxChain) {
		this.chain = nxChain;
	}

	public void dispense(Currency cur) {
		if(cur.getAmount() >= 10) {
			int num = cur.getAmount()/10;
			int rem = cur.getAmount() % 10;
			System.out.println("Dispending: " +num + " 10$ note");
			if(rem != 0)
				this.dispense(new Currency(rem));
		} else {
			this.chain.dispense(cur);
		}

	}

}
