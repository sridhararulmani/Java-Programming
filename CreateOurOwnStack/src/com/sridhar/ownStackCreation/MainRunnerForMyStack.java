package com.sridhar.ownStackCreation;

public class MainRunnerForMyStack { 
	public static void main(String[] args) {
		int search=10;
		MyStack ms=new MyStack(5);
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		ms.push(50);
		System.out.println(ms);//[ 10,20,30,40,50, ]
		System.out.println(ms.pop());//50
		System.out.println(ms.pop());//40
		System.out.println(ms);
		System.out.println(ms.peek());//30
		System.out.println("Current Size of the Stack is :"+ms.size());
		int pesentIn=ms.search(search);
		System.out.println(search+" is Present in "+pesentIn+" index of your stack");
		ms.pop();
		System.out.println(ms);
		System.out.println(ms.size());
		ms.push(77);
		System.out.println(ms);
	}
}