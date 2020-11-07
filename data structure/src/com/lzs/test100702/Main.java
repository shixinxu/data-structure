package com.lzs.test100702;

public class Main {
	public char[] str; // 使用字符数组存放串值
	public static int curlen; // 当前字符串的长度

	public Main() {
		str = new char[0];
		curlen = 0;
	}

	// 以字符串常量构造串
	public Main(String string) {
		char[] a = string.toCharArray();
		str = a;
		curlen = a.length;
	}

	// 以字符数组构造串
	public Main(char[] astr) {
		str = new char[astr.length];
		for (int i = 0; i < astr.length; i++) {
			str[i] = astr[i];
		}
		curlen = str.length;
	}

	// 将串变为空串
	public void clear() {
		curlen = 0;
	}

	// 判断是否为空串
	public boolean isEmpty() {
		return curlen == 0;
	}

	// 返回串的长度
	public int length() {
		return curlen;
	}

	// 返回位序号为i的字符
	public char charAt(int i) {
		System.out.println(curlen);
		if (i < 0 || i >= curlen)
			throw new StringIndexOutOfBoundsException(i);
		return str[i];
	}

	// 将串的长度扩充为newCapacity
	public void allocate(int newCapacity) {
		char[] tmp = str;
		str = new char[newCapacity];
		for (int i = 0; i < tmp.length; i++) {
			str[i] = tmp[i];
		}
	}

	// 返回位序号从begin到end-1的子串，注意，此处串的起始位置为0；
	public String subString(int begin, int end) {
		if (begin < 0 || begin >= end || end > curlen)
			throw new StringIndexOutOfBoundsException("the parameter is illegal!");
		char[] tmp = new char[end - begin];
		for (int i = begin; i < end; i++) {
			tmp[i - begin] = str[i];
		}
		return String.valueOf(tmp);
	}

	// 在第i个字符之前插入字串str
	public void insert(int i, String aString) {
		if (i < 0 || i > curlen)
			throw new StringIndexOutOfBoundsException("the inserted location is illegal");
		int len = aString.length();
		int newcapacity = len + curlen;
		allocate(newcapacity); // 重新分配存储空间
		for (int j = curlen - 1; j >= i; j--) // 移动数据元素
		{
			str[j + len] = str[j];
		}
		for (int j = i; j < i + len; j++) {
			str[j] = aString.charAt(j - i);
		}
	}

	// 删除操作
	public void delete(int begin, int end) {
		if (begin < 0 || end > curlen || begin >= end)
			throw new StringIndexOutOfBoundsException("the parameter is illegal!");
		for (int i = begin; i < end - 1; i++) {
			str[i] = str[i + end - begin];
		}
		curlen = curlen - end + begin;
	}

	// 打印字符串
	public void print() {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main aMain = new Main("hello world");
		String aString = "thank you";
		System.out.println(curlen);
		System.out.println("if the string is empty:" + aMain.isEmpty());
		System.out.println("the length of this string:" + aMain.length());
		System.out.print("the character of the serial number betweent one and three is :");
		System.out.println(aMain.subString(1, 4));
		aMain.print();
		aMain.insert(2, aString);
		aMain.print();
	}
}
