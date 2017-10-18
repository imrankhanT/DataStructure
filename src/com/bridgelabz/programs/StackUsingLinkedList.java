package com.bridgelabz.programs;

import java.util.LinkedList;

public class StackUsingLinkedList<T> {
	public LinkedList<T> stack;
	
	public int topOfArray;
	
	public StackUsingLinkedList() {
		stack=new LinkedList<T>();
		topOfArray=-1;
	}
	
	public void push(T element) {
		topOfArray++;
		stack.add(topOfArray, element);
	}
	
	public void pop() {
		if(topOfArray==-1)
			System.out.println("Stack is empty");
		else {
			stack.removeLast();
			topOfArray--;
		}	
	}
	
	public boolean isEmpty() {
		return (topOfArray==-1);
	}
	
	public int size() {
		return stack.size();
	}
	
	public T getElement(int index) {
		return stack.get(index);
}
}
