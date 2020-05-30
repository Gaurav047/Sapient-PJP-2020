package com.sapient.questions;
import java.io.File;

public class PrintFilesInDirectory {

	public static void main(String[] args) {
		
		File folder = new File("/Users/adityaatri/Desktop/sapient_learning");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File -> " + listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory -> " + listOfFiles[i].getName());
		  }
		}
	}

}
