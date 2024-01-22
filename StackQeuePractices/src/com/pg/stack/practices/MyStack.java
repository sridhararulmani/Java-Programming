package com.pg.stack.practices;

public class MyStack {
	int capacity;
	int size;
	int top;
	Object[] obj;
	public MyStack(int capacity) {
		this.capacity=capacity;
		obj=new Object[capacity];
		top=-1;
	}
	public void push(Object ele) {
		if(top==capacity-1) {
			System.out.println("Stack OverFlow");
			return;
		}
		obj[++top]=ele;
		size++;
	}
	public Object pop() {
		if(top==-1) {
			System.out.println("Stack is UnderFlow");
			return null;
		}
		size--;
		return obj[top--];
	}
	public String toString() {
		String str="[",spc=" ";
		for(int i=0;i<=top;i++) {
			str=str+obj[i];
			if(i<top) {
				str=str+spc;
			}
		}
		return str+"]";
	}
	public Object peek() {
		if(top==-1) {
			System.out.println("Stack UnderFlow");
			return null;
		}
		return obj[top];
	}
	public int size() {
		return size;
	}
	public int search(Object ele) {
		for(int i=top;i<=0;i++) {
			if(obj[top].equals(ele)) {
				return top-i+1;
			}
		}
		return 0;
	}
}