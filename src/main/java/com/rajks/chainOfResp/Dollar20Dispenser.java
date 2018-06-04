package com.rajks.chainOfResp;

public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;

	public void setNextChain(DispenseChain nxChain) {
		this.chain = nxChain;
	}

	public void dispense(Currency cur) {
		if(cur.getAmount() >= 20) {
			int num = cur.getAmount()/20;
			int rem = cur.getAmount() % 20;
			System.out.println("Dispending: " +num + " 20$ note");
			if(rem != 0)
				this.dispense(new Currency(rem));
		} else {
			this.chain.dispense(cur);
		}

	}

}
