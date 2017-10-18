package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class palindromChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the String....");
	    String str=scanner.nextLine();
	    
	   System.out.println((utility.PalindromChecker(str)));
	   scanner.close();
	}
}
