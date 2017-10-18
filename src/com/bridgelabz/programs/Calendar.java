package com.bridgelabz.programs;

import com.bridgelabz.utility.utility;

public class Calendar {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		utility.calendarLogic(month, year);
	}
}