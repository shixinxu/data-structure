package com.lzs.test06;

public class ArrayStack {
	private int maxSize;
	private int[] stack;
	private int top = -1;
	 public ArrayStack(int maxSize) {
		 this.maxSize = maxSize;
		 stack = new int[this.maxSize];
	 }
	 //栈满
	 public boolean isFull() {
		return top == maxSize-1;
	}
	 //栈空
	 public boolean isEmpty() {
		return top == -1;
	}
	 //进栈
	 public void push(int value) {
		if(isFull()) {
			System.out.println("栈满");
		}
		top++;
		stack[top]= value;
		
	 }
	 //出栈
	 public int pop() {
		 if(isEmpty()) {
			 throw new RuntimeException("栈空");
		 }
		 int value = stack[top];
		 top--;
		 return value;
	 }
	 //遍历栈
	 public void list() {
		if(isEmpty()) {
			System.out.println("栈空，没有数据");
			return;
			
		}
		for(int i= top;i>=0;i--) {
			System.out.printf("stack[%d]=%d\n",i,stack[i]);
		}
	}

}
