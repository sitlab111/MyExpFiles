package com.raj.ks.command;
/**
 * Create Invoker class
 * Invoker is a simple class that encapsulates the Command and passes the
 * request to the command object to process it.
 * @author rsomashekarappa
 *
 */

public class FileInvoker {
	public Command cmd;
	public FileInvoker(Command c) {
		this.cmd = c;
	}
	public void execute() {
		this.cmd.execute();
	}

}
