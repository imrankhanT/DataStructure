package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class BalanceParenthsis {

	public static void main(String[] args) {
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Parenthsis......");
		str=s.nextLine();
		System.out.println(utility.isBalanced(str));

	}
}
