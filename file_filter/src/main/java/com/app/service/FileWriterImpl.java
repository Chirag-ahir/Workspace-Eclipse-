package com.app.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.app.exception.*;

public class FileWriterImpl implements WriteCSVFile, Runnable {
	public void run() {
		try {
			writecsvfile();
		} catch (FilenotfoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public void writecsvfile() throws FilenotfoundException {
		try {
			String line = "";
			int count = 0, count1 = 0, count2 = 0;

			BufferedReader br = new BufferedReader(new FileReader(
					"D:\\MIIT\\JAVA Eclipse\\file_filter\\src\\main\\java\\com\\app\\file\\csvdata.csv"));
			FileWriter cwriter = new FileWriter(
					"D:\\MIIT\\JAVA Eclipse\\file_filter\\src\\main\\java\\com\\app\\file\\creditdata.csv");
			FileWriter dwriter = new FileWriter(
					"D:\\MIIT\\JAVA Eclipse\\file_filter\\src\\main\\java\\com\\app\\file\\debitdata.csv");
			FileWriter ewriter = new FileWriter(
					"D:\\MIIT\\JAVA Eclipse\\file_filter\\src\\main\\java\\com\\app\\file\\errordata.csv");

			while ((line = br.readLine()) != null) { // returns a Boolean value
				
				String[] data = line.split(","); // use comma as separator
				int temp = 0;

				for (String str : data) {
					try {
						Double amount = Double.parseDouble(data[2]);
						if (amount > 0.0) {
							cwriter.write(str + ",");
							temp = 0;
						} else if(amount < 0.0) {
							dwriter.write(str + ",");
							temp = 1;
						} 
					} catch (Exception e) {
						ewriter.write(str + ",");
						temp = 2;
					}
				}
				if (temp == 0) {
					cwriter.write("\n");
					count++;
				} else if (temp == 1) {
					dwriter.write("\n");
					count1++;
				} else if(temp == 2){
					ewriter.write("\n");
					count2++;
				}
			}

			cwriter.close();
			dwriter.close();
			ewriter.close();
			int total_data = count + count1;
			System.out.println("\nTotal lines in csv file:" + total_data + "\n");
			System.out.println("Total lines in credit csv file:" + count + "\n");
			System.out.println("Total lines in debit csv file:" + count1 + "\n");
			System.out.println("Total lines in error csv file:" + count2 + "\n");

		} catch (IOException e) {
			throw new FilenotfoundException("File not found");
		}
	}

}
