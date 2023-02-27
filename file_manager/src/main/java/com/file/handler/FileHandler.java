package com.file.handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.file.dto.Customer;
import com.file.operation.FileAppend;
import com.file.operation.FileCreate;
import com.file.operation.FileDelete;
import com.file.operation.FileReading;
import com.file.operation.FileWriting;

public class FileHandler extends Customer implements FileWriting, FileReading, FileCreate, FileDelete, FileAppend {

	public FileHandler(int id, int age, String name, String address) {
		super(id, age, name, address);
	}

	public void reading(String file) {
		String text = "";
		try {
			Scanner sc = new Scanner(new File(file));
			while (sc.hasNextLine()) {
				text = text + sc.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println(text);
	}

	public void writing(String file) {
		// String data = "101, 20, C Ahir, Brampton";
		try {
			FileWriter write = new FileWriter(file);
			write.write(id + " ");
			write.write(name + " ");
			write.write(age + " ");
			write.write(address + " ");
			// write.write(data);
			System.out.println("Data written successflly\n");
			write.close();
		} catch (IOException e) {
			System.out.println("File write error...");
		}
	}
	
	public void append(String file) {
		try {
			FileWriter write = new FileWriter(file, true);
			write.write("\n");
			write.write(id + " ");
			write.write(name + " ");
			write.write(age + " ");
			write.write(address + " ");
			System.out.println("Data appended successflly\n");
			write.close();
		} catch (IOException e) {
			System.out.println("File append error...");
		}
	}

	public void create(String file) {
		File myfile = new File(file);
		try {
			if (myfile.createNewFile()) {
				System.out.println("File created successfuly.");
			} else {
				System.out.println("error");
			}
		} catch (Exception e) {
			System.out.println("Filename error....");
		}
	}

	public void delete(String file) {
		File myfile = new File(file);
		if(myfile.delete()) {
			System.out.println(myfile.getName() + " deleted successfully! ");
		}
		else {
			System.out.println("File delete unsuccessfull!");
		}
	}
	
	public void export(String file) {
		//logic
	}

}
