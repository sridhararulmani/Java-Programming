package com.pg.stack.practices;

public class MainRunnerForMystack {
	public static void main(String[] args) {
		MyStack ms=new MyStack(4);
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		System.out.println(ms);
		ms.pop();
		System.out.println(ms);
		System.out.println(ms.peek());
		System.out.println(ms.search(20));
	}
}
