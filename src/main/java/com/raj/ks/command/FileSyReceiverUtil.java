package com.raj.ks.command;
/**
 * write a simple command pattern client program. But before that I will provide
 * a utility method to create the appropriate FileSystemReceiver object.
 * @author rsomashekarappa
 *
 */

public class FileSyReceiverUtil {
	
	public static FileSystemReceiver getUnderlyingSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is: " +osName);
		if(osName.contains("Windows")){
			 System.out.println("WindowsFileSystemReceiver()");
			 return null;
		 }else{
			 return new UnixFileSystemReceiver();
		 }
		
	}

}
