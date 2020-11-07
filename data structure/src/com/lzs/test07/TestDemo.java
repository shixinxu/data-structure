package com.lzs.test07;

public class TestDemo {
	public static void main(String[] args) {
		InitStack stack = new InitStack(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		String string01 = stack.stackTraverse();
		System.out.println(string01);
		stack.pop();
		String string02 = stack.stackTraverse();
		System.out.println(string02);
	}

}
