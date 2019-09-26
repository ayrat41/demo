package com.file.manipulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class createFile {

	public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\asadu\\Documents\\PNT\\screenshoot\\file.txt");
	file.createNewFile();
	FileWriter writer = new FileWriter(file);
	writer.write("Selenium1");
	writer.write("\r\n");
	writer.write("Selenium2");
	writer.write("\r\n");
	writer.write("Selenium3");
	writer.write("\r\n");
	writer.write("Selenium4");
	writer.write("\r\n");
	writer.close();
	FileReader reader = new FileReader(file);
	int i;
	while ((i = reader.read()) !=-1 ){
		System.out.println((char)i);
		
	}
	System.out.println(reader.read());
	reader.close();
	
	
	Scanner scanner = new Scanner(file);
	scanner.useDelimiter("//");
	System.out.println(scanner.next());
		System.out.println("*******************");
	while (scanner.hasNext()) {
		System.out.println(scanner.nextLine());
	}

	scanner.close();
	BufferedReader bf = new BufferedReader(new FileReader(file));
	String St;
	while ((St=bf.readLine()) != null) {
		System.out.println(St);
		}
	}	

}
