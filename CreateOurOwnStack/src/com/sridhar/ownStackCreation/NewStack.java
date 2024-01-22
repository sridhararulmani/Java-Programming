package com.sridhar.ownStackCreation;

public class NewStack {
	public int capacityOfStack;
	public int size;
	public int top;
	Object[] obj;
	public NewStack(int capacityOfStack) {
		this.capacityOfStack=capacityOfStack;
		obj=new Object[capacityOfStack];
		top=-1;
	}
	public void push(Object ele) {
		if(top==capacityOfStack-1) {
			System.out.println("Stack OverFlow");
			return;
		}
		obj[++top]=ele;
		size++;
	}
	public Object pop() {
		if(top==-1) {
			System.out.println("stack under Flow....");
			return null;
		}
		size--;
		return obj[top--];
	}
	public Object peek() {
		if(top==-1) {
			System.out.println("Stack Underflow....");
			return null;
		}
		return obj[top];
	}
	public Object search(Object ele) {
		String str;
		for(int i=top;i>=0;i--) {
			if(obj[i].equals(ele)) {
				int str1=(int)obj[i],str2=(int)top-i;
				return str=str1+" is Present in "+str2;
			}
		}
		return "The Element is not Present";
	}
	public int size() {
		return size;
	}
	@Override
	public String toString() {
		String str="[";
		for(int i=0;i<=top;i++) {
			str=str+obj[i];
			if(i<top) {
				str=str+",";
			}
		}
		return str+"]";
	}
}