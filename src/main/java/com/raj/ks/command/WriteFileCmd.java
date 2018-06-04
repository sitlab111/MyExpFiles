package com.raj.ks.command;

public class WriteFileCmd implements Command {
private FileSystemReceiver fileSy;
	
	public WriteFileCmd(FileSystemReceiver fs) {
		this.fileSy = fs;
	}

	public void execute() {
		this.fileSy.writeFile();

	}

}
