package com.lzs.test04;

public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add(0, "newone");
		list.add(1, "newtwo");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.getValue(i) + " ");
		}
		// 测试set
		System.out.println();
		list.set(0, "111");
		list.set(1, "222");
		System.out.println(list.getValue(0) + "   " + list.getValue(1));

		// 测试delete
		System.out.println();
		list.delete(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.getValue(i) + " ");
		}
	}
}
