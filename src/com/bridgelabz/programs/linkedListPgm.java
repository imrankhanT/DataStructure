package com.bridgelabz.programs;

import java.io.*;
import java.util.*;

public class linkedListPgm {
	Node top;
	int size;
	static String result="";
	
private class Node{
	String data;
	Node next;
}

linkedListPgm(){
	top=null;
	size=0;
}
 
String[] readIngDataFromFile() throws IOException {
	File file=new File("/home/bridgeit/eclipse-workspace/DatastructurePorgrams/src/com/bridgelabz/programs/unorderedList");
	boolean mark=false;
    BufferedReader buffer=new BufferedReader(new FileReader(file));
    Scanner scanner=new Scanner(System.in);
    String words=buffer.readLine();
    String[] str1=words.trim().split(" ");
    System.out.println(str1);
	return str1;
    
}

void push(String data) {
	Node temp=new Node();
	temp.data=data;
	temp.next=top;
	top=temp;
}

void searchRemove(String data) throws IOException {
	Node temp=top,prev;
	
	while(temp.data!=data) {
		prev=temp;
		temp=temp.next;
		if(temp==null) {
			push(data);
			return;
		}
	}
	prev=temp.next;
	write();
}

void display() {
	Node temp=top;
	
	while(temp!=null) {
	System.out.print(temp.data+"  ");
	temp=temp.next;
	}
}

void write() throws IOException {
	FileWriter filewriter = new FileWriter("/home/bridgeit/eclipse-workspace/DatastructurePorgrams/src/com/bridgelabz/programs/unorderedList");
	Node temp=top;
	
	while(temp!=null) {
		result=result+temp.data;
	}
	filewriter.write(result);
	filewriter.flush();
	filewriter.close();
}
}
