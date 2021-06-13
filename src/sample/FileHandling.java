package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	public static void main(String[] args) {
		// Print all folders and file in the sorted orders.

		 String path = "C://Users//girish.bhamare//Downloads//";
		
		 File file = new File(path);
		 File downloadDir[] = file.listFiles();
		 Arrays.sort(downloadDir);
		
		 for (File e : downloadDir) {
		 if (e.isFile()) {
		 System.out.println("File Name is :" + e.getName());
		 } else if (e.isDirectory()) {
		 System.out.println("Directory Name is :" + e.getName());
		 } else {
		 System.out.println("Unknown:" + e.getName());
		 }
		
		 }
		 
		// Copy 1 pdf file to another with different name and same location.
		copyFile();
	}

	public static void copyFile() {

		String fileInputPath = "C://Users//girish.bhamare//Downloads//Appointment_slip.pdf";
		String fileOutputPath = "C://Users//girish.bhamare//Downloads//Appointment_slip-Copy.pdf";

		File fileInput = new File(fileInputPath);
		File fileOutput = new File(fileOutputPath);

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		// fileInputStream.

		try {
			fileInputStream = new FileInputStream(fileInput);
			fileOutputStream = new FileOutputStream(fileOutput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int i = 0;
		try {
			while ((i = fileInputStream.read()) != -1) {

				fileOutputStream.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (fileOutputStream != null) {

				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
