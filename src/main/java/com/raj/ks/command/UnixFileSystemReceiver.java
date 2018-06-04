package com.raj.ks.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {

	public void openFile() {
		System.out.println("Opening file on Unix File System");

	}

	public void writeFile() {
		System.out.println("Writing file on Unix File System");

	}

	public void closeFile() {
		System.out.println("Closing file on Unix File System");

	}

}
