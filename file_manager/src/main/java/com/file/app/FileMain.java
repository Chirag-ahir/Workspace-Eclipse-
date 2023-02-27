package com.file.app;

import java.io.IOException;

import com.file.handler.FileHandler;

public class FileMain {
	public static void main(String args[]) throws IOException {

		FileHandler IO = new FileHandler(1, 20, "chirag", "aspermont");
		// FileHandler IO1 = new FileHandler(2,21,"shruti","rajkot");

		//IO.create("sample.txt");
		//IO.writing("sample.txt");
		// IO.append("sample.txt");
		IO.reading("sample.txt");
		// IO.delete("sample.txt");
		
	}
}
