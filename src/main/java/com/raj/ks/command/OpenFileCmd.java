package com.raj.ks.command;

public class OpenFileCmd implements Command {
	private FileSystemReceiver fileSy;
	public OpenFileCmd(FileSystemReceiver fs) {
		this.fileSy = fs;
	}
	
	public void execute() {
		this.fileSy.openFile();

	}

}
