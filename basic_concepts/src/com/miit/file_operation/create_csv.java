package com.miit.file_operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class create_csv {
	
	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter(new File("D:\\MIIT\\JAVA Eclipse\\basic_concepts\\src\\com\\miit\\file_operation\\booksname.csv"));
			StringBuilder sb = new StringBuilder();
			
			sb.append("book id");
			sb.append(",");
			sb.append("book name");
			sb.append(",");
			sb.append("category");
			sb.append("\n");
			
			sb.append("101");
			sb.append(",");
			sb.append("sita_raman");
			sb.append(",");
			sb.append("old");
			sb.append("\n");
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("write operation finished");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
