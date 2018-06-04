package com.raj.ks.command;

/** Base command  - interface or Abstract Class 
 * create implementations for all the different types of action performed by the receiver.
 * we have three actions we will create three Command implementations.
 * Each Command implementation will forward the request to the appropriate method of receiver.
 * @author rsomashekarappa
 *
 */
public interface Command {
	void execute();

}
