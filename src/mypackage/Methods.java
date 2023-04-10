package mypackage;

import java.util.*;
import java.io.*;

public class Methods {
	
	public static String userDir() {
		Scanner sc = new Scanner(System.in);
		String mainDirectory = sc.next();
		return mainDirectory;
	}

	public static void displayFiles(String m) {
		String mainDirectory = m;
		File files = new File(mainDirectory);
		File fileList[] = files.listFiles();
		Arrays.sort(fileList);
		int i = 0;
		for (File f : fileList) {
			i++;
			System.out.println(i + "-->  " + f.getName());
		}
	}

	public static void addFile(String m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name of file to be created");
		String newFileName = sc.nextLine();
		String path = (m + newFileName);
		File file = new File(path);
		boolean value = false;
		try {
			value = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (value) {
			System.out.println("New file created successfully");
		} else {
			System.out.println("File not created");
		}
	}

	public static void deleteFile(String m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name of file to be deleted");
		String deletingFile = sc.nextLine();
		String path = (m + deletingFile);
		File file = new File(path);
		boolean value = file.delete();
		if (value) {
			System.out.println("File successfully deleted");
		} else {
			System.out.println("File doesn't exist");
		}
	}

	public static void searchFile(String m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name to search");
		String searchingFile = sc.nextLine();
		String path = (m + searchingFile);
		File file = new File(path);
		boolean value = file.exists();
		if (value) {
			System.out.println("File found");
		} else {
			System.out.println("File not found");
		}
	}
}
