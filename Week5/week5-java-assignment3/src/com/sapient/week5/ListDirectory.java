package com.sapient.week5;

import java.io.File;

public class ListDirectory {
	
	static void recursivePrint(File []arr, int level) {
		for (File file : arr) {
			for (int i = 0; i < level; i++) {
				System.out.print("\t");
			}
			if (file.isFile()) {
				System.out.println(file);
			}
			else if (file.isDirectory() && !file.isHidden() && !file.toString().contains(".")) {
				System.out.println("[ " + file + " ]");
				recursivePrint(file.listFiles(), level + 1);
			}
		}
	}

	
	
	public static void main(String[] args) {
		
		String ROOTPATH = "D:\\PublicisSapient\\prejoining-learning-program";
		
		File rootPath = new File(ROOTPATH);
		
		if (rootPath.exists() && rootPath.isDirectory()) {
			File arr[] = rootPath.listFiles();
			
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Files From Directory : " + rootPath);
			System.out.println("----------------------------------------------------------------------------------");
			
			recursivePrint(arr, 0);
		}
	}

}
