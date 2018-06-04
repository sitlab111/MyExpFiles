package com.rajks.chainOfResp;
/**
 * The base interface should have a method to define the next processor in the chain and the 
 * method that will process the request. Our ATM Dispense interface will look like below.
 * @author rsomashekarappa
 *
 */

public interface DispenseChain {
	void setNextChain(DispenseChain nxChain);
	void dispense(Currency cur);

}
