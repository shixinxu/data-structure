package com.lzs.test05;

import java.io.PrintWriter;
import java.nio.charset.MalformedInputException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CiDlNode {

	private Object data;
	private CiDlNode next;
	private CiDlNode prev;
	private static CiDlNode first;
	
	public CiDlNode() {
		super();
	}
	public CiDlNode(Object data,CiDlNode next,CiDlNode prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	public static void insert(Object data,int index) {
		CiDlNode node = new CiDlNode(data,null,null);
		if (index == 0) {
			node.next = first.next;
			first.next.prev = node;
			first.next = node;
			node.prev = first;
		}else {
			int temp = 0;
			for(CiDlNode n = first.next;; n=n.next) {
				temp++;
				if(temp == index) {
					node.next = n.next;
					node.next = n.next;
					n.next.prev = node;
					n.next = node;
					break;
				}
			}
		}
	}
	public static void remove(Object data) {
		for(CiDlNode n = first.next;n!= first;n = n.next) {
			if(node.data.equals(data)) {
				n.prev.next = n.next;
				n.next.prev = n;
			}
		}
	}
	public static void print() {
		for(CiDlNode node = first.next;node!= first;node = node.next) {
			System.out.println(node.data + "");}
			System.out.println();
		}
	public static void main(String[] args) {
			first = new CiDlNode("0",null,null);
			CiDlNode node1 = new CiDlNode("aaa",null,first);
			CiDlNode node2 = new CiDlNode("bbb",null,node1);
			CiDlNode node3 = new CiDlNode("ccc",null,node2);
			CiDlNode node4 = new CiDlNode("ddd",first,node3);
			node3.next = node4;
			node2.next = node3;
			node1.next = node2;
			first.next = node1;
			
			System.out.println("当前链表：");
			print();
			insert("ddd", 5);
			System.out.println("插入后链表：");
			print();
			remove("ddd");
			System.out.println("删除后链表：");
			print();
		}
	}

