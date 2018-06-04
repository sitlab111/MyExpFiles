package com.raj.ks.command;

public class CloseFileCmd implements Command {
	private FileSystemReceiver fileSy;
	
	public CloseFileCmd(FileSystemReceiver fs) {
		this.fileSy = fs;
	}

	public void execute() {
		this.fileSy.closeFile();

	}

}
