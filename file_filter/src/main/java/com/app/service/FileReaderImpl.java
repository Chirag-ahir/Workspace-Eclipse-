package com.app.service;

import java.util.Scanner;

import com.app.exception.FilenotfoundException;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReaderImpl implements ReadCSVfile, Runnable {
	
	public void run() {
		try {
			readcsvfile();
		} catch (FilenotfoundException e) {
			e.printStackTrace();
		}
	}

	public void readcsvfile() throws FilenotfoundException {
		try {
			Scanner sc = new Scanner(
					new File("D:\\MIIT\\JAVA Eclipse\\file_filter\\src\\main\\java\\com\\app\\file\\csvdata.csv"));
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				System.out.print(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			throw new FilenotfoundException("File not found");
		}

	}

}