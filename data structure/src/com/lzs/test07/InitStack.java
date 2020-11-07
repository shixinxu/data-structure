package com.lzs.test07;

public class InitStack {
	private int[] stack = null;// 存储元素
	private int top = 0;// 指示顶元素在顺序栈中的位置

	public InitStack(int max) {
		// 初始化自定义大小的顺序栈
		this.stack = new int[max];
	}

	public void clearStack() {
		this.top = 0;// 直接令栈顶指针指向栈底即可
	}

	public boolean stackEmpty() {
		if (this.top == 0) {
			// 检测栈顶指针是否指向栈底即可
			return true;
		} else {
			return false;
		}
	}
	public int stackLength() {
		return this.top;// 栈顶指针的值即代表了元素个数
	}

	public int[] getTop() {
		if (this.top == 0) {
			// 如果顺序栈为空，则返回空
			return null;
		}
		int[] i = new int[1];
		i[0] = stack[this.top - 1];// 获取栈顶元素
		return i;
	}

	public boolean push(int value) {
		if (this.top == this.stack.length) {
			// 判断顺序栈是否已满
			return false;

		}
		this.stack[this.top] = value;// 压入元素
		this.top++;// 栈顶指针加一
		return true;
	}

	public int[] pop() {
		if (this.top == 0) {
			// 判断顺序栈是否已空
			return null;

		}
		int[] i = new int[1];
		this.top--;// 栈顶指针减一
		i[0] = stack[this.top];// 获取栈顶元素
		return i;
	}

	public String stackTraverse() {
		// 通过输出顺序栈元素来表示遍历
		String s = "";// 存储要输出的元素

		for (int i = 0; i < this.top; i++) {
			// 循环遍历
			s += this.stack[i] + "、";

		}
		if (s.length() == 0) {
			// 如果未获取到元素，返回空字符串
			return s;
		}
		return s.substring(0, s.length() - 1);// 除去最后一个顿号后返回
	}
}
