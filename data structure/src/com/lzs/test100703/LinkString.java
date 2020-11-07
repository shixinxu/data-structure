package com.lzs.test100703;

public class LinkString {
	Node head = new Node();
	// 实际表长
	int curlen;

	// 结点内部类
	private class Node {
		public char c;
		public Node next;

		public Node() {
			c = (Character) null;
			next = null;
		}
	}

	public Node query(int i) {
		Node p = head;
		if (i < 0 || i > curlen) {
			return p;
		}
		for (int j = 0; j <= i; j++) {
			p = p.next;
		}
		return p;
	}

	public void insert(char c, int i) {
		Node data = new Node();
		data.c = c;
		if (i < 0 || i > curlen) {
			System.out.println("i值无效");
			return;
		}
		if (curlen == 0) {
			head.next = data;
		} else {
			// 查询插入元素的前一个元素
			Node p = query(i - 1);
			// 修改前一个元素的指针
			data.next = p.next;
			p.next = data;
		}
		curlen++;
	}

	public Node delec(int i) {
		Node node;// 保存删除的第i个结点
		// 判断删除位置是否正确f
		if (i < 0 || i > curlen) {
			System.out.println("删除位置i无效");
			return null;
		}
		// 查找要删除结点的前一个元素
		Node p = query(i - 1);
		node = p.next;
		p.next = node.next;
		curlen--;
		return node;
	}

}
