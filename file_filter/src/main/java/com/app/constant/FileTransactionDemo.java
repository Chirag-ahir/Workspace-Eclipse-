package com.app.constant;

import com.app.service.FileReaderImpl;
import com.app.service.FileWriterImpl;


public class FileTransactionDemo {
	public static void main(String args[]) {

		FileReaderImpl fileread = new FileReaderImpl();
		Thread t1 = new Thread(fileread);

		FileWriterImpl filewrite = new FileWriterImpl();
		Thread t2 = new Thread(filewrite);

		t1.start();
		t2.start();

	}
}
