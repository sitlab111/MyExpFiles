package com.rajks.chainOfResp;

import java.util.Scanner;

public class AtmDisChain {
	private DispenseChain c1;
	
	public AtmDisChain() {
		//init the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();
		
		//set the chain
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		AtmDisChain atmDis = new AtmDisChain();
		while(true) {
			int amt = 0;
			System.out.println("Enter the amount to Dispense");
			Scanner input = new Scanner(System.in);
			amt = input.nextInt();
			if(amt % 10 != 0) {
				System.out.println("Dispense Amount should be multiple of 10$");
				return;
			}
			//process the dispense
			atmDis.c1.dispense(new Currency(amt));
		}

	}

}
