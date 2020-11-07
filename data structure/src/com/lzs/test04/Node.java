package com.lzs.test04;

public class Node<E> {
private E e;//数据data
private Node<E> next;//纸箱下一个节点

public Node(){}
public Node(E e) {
	this.e = e;
}
	public Node<E> getNext(){
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	public E getE() {
		return e;
	}
	public void setE(E e) {
		this.e = e;
	}
}
