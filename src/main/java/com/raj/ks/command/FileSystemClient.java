package com.raj.ks.command;

public class FileSystemClient {

	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReceiver fs = FileSyReceiverUtil.getUnderlyingSystem();
		
		//creating command and associating with receiver
		OpenFileCmd openFileCommand = new OpenFileCmd(fs);
				
		//Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
				
		//perform action on invoker object
		file.execute();
				
		WriteFileCmd writeFileCommand = new WriteFileCmd(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
				
		CloseFileCmd closeFileCommand = new CloseFileCmd(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();

	}

}
