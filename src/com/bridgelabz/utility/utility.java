package com.bridgelabz.utility;

import java.io.*;
import java.util.*;

public class utility {

	/**
	 * Logic for Unorder List 
	 */
	public static void unorderedList() {
		try {
		File file=new File("/home/bridgeit/eclipse-workspace/DatastructurePorgrams/src/com/bridgelabz/programs/unorderedList");
		boolean mark=false;
	    BufferedReader buffer=new BufferedReader(new FileReader(file));
	    Scanner scanner=new Scanner(System.in);
	    String words=buffer.readLine();
	    FileWriter filewriter = new FileWriter("/home/bridgeit/eclipse-workspace/DatastructurePorgrams/src/com/bridgelabz/programs/unorderedList");
	    String[] str1=words.trim().split(" ");
	    
	    LinkedList<String> l=new LinkedList<String>();
	
	    for(int i=0;i<str1.length;i++)
	    	l.add(str1[i]);
	    
	    System.out.println("Before performing a operation.......");
	    System.out.println(l.toString());
	    
	    System.out.println("Enter the String to search...");
	    String search=scanner.next();
	     
	    for(int i=0;i<l.size();i++) {
	    	if(l.get(i).equals(search)) {
	    		l.remove(i);
	    		mark=true;		    	
	    		}
	    }
	    
	    
	    if(mark==false)
		    l.add(search);	
	    
	    if(mark==true) {
	    for(int i=0;i<l.size();i++) {
	    	String str2=(String)(l.get(i))+" ";
	    	filewriter.write(str2);
	    	filewriter.flush();
	    }
	   
	    }else {
	    	for(int i=0;i<l.size();i++) {
	    	String str11=(String) l.get(i)+" ";
	    	filewriter.write(str11);
	    	filewriter.flush();
	    	}
	    }
	    System.out.println("After Performing a operation......");
		System.out.println(l.toString());
	    buffer.close();	
	    scanner.close();
	    filewriter.close();
        }catch(Exception e) {
	    e.printStackTrace();
                            }
	
	}
	
	/**
	 * @throws Exception
	 * Logic for oderlist
	 */
	public static void orderList() throws Exception {
		Scanner scanner=new Scanner(System.in);
		File file = new File("/home/bridgeit/eclipse-workspace/DatastructurePorgrams/src/com/bridgelabz/programs/orderlist.txt");
		BufferedReader br = new BufferedReader( new FileReader(file));
		LinkedList<Integer> list = new LinkedList<Integer>();
		String s;
		String arr[]=null;
		while((s=br.readLine())!=null)
	    arr  = s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		list.add(Integer.parseInt(arr[i]));
		
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		Iterator itr = list.iterator(); 
		System.out.println("Enter the element to find");
		int key = scanner.nextInt();
		while(itr.hasNext())
		{
			if(list.contains(key))
			{
				list.remove(list.indexOf(key));
				break;
			}
			else
			{
				list.add(key);
				list.sort(null);
				break;
			}
		}
		String str ="";
		Iterator itr1 = list.iterator();
		while(itr1.hasNext())
		{
			str+= itr1.next()+" ";
		}
		FileWriter fw = new FileWriter(file);
		fw.write(str);
		fw.flush(); 
		scanner.close();
	}
	
	
	/**
	 * @param str
	 * @return
	 * logic to balance the parenthsis........
	 */
	public static boolean isBalanced(String Expression) {
		Stack<Character> stack=new Stack<Character>();
			
		for(int i=0;i<Expression.length();i++) {
			if(Expression.charAt(i)=='(' || Expression.charAt(i)=='{' || Expression.charAt(i)=='[')
				stack.push(Expression.charAt(i));
			else if(stack.isEmpty())
				return false;
			 if( (Expression.charAt(i)==')') && (stack.peek()=='('))
				stack.pop();
			 if((Expression.charAt(i)=='}') && (stack.peek()=='{'))
				stack.pop();
			 if((Expression.charAt(i)==']') && (stack.peek()=='[')) 
				stack.pop();	
		}
		return stack.isEmpty() ? true : false;
		
	}

	
	/**
	 * @param str
	 * @return
	 * Logic to check the palindrom of a string
	 */
	public static boolean PalindromChecker(String str) {
		ArrayDeque<Character> queue=new ArrayDeque<Character>();
		int i,n;
		
		for(i=0;i<str.length();i++) 
			queue.add(str.charAt(i));
		 
		if(queue.size()%2==0)
	       n=queue.size();
		else n=queue.size()-1;
		while(!queue.isEmpty() && n>0) {
			if(queue.peekFirst().equals(queue.peekLast())) {
				queue.removeLast();
				queue.removeFirst();
				
				n=n-2;
			}
			else return false;;
				}
		
		return n==0 ?  true : false;
}
	
	/**
	 * @param month
	 * @param year
	 * Logic to print the calendar
	 */
	public static int calendarLogic(int month,int year) {
		String months[] ={"","January","February","march","April","may","June","July","August","september","October","November","December"};
		int days[]= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(month==2 && leapYear(year))
			days[month]=29;
		
		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");
		
		int number_days=day(month,1,year);
		
		for(int i=0;i<number_days;i++)
			System.out.print("   ");
		
		for(int i=1;i<=days[month];i++) {
			System.out.printf("%2d ",i);
			 if (((i + number_days) % 7 == 0) || (i == days[month]))
	            	System.out.println();	
			 
		}
		return number_days;
	} 
		private static int day(int month, int day, int year) {
		    int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	}

	private static boolean leapYear(int year) {
		  if  (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			  return true;
	          return false;
	}
	
	/**
	 * @param n
	 * @return
	 * Logic to find number of test cases
	 */
	public static long find(int n)
	{
		long sum=0;
		if(n<=1)
			return 1;
		else
		{
			
			for(int i=1;i<=n;i++)
			{
				sum = sum+(find(i-1)*find(n-i));
			}
		}
		return sum;
		
}
}
