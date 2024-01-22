package com.sridhar.ownStackCreation;

public class MainReunnerForNewStack {
	public static void main(String[] args) {
		NewStack s=new NewStack(10);
		s.push(10);
		s.push(3);
		s.push(11);
		s.push(111);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search(111));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.search(3));
	}
}
