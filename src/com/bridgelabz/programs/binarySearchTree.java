package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class binarySearchTree {

	public static void main(String[] args) {
		
                Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the number of node.");
				long n = scanner.nextInt();
				long count = utility.find((int) n);
				System.out.println(count);
	}
}
