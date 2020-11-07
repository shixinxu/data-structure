package com.lzs.test06;

import java.util.Scanner;

public class ArrayStackDemo {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(4);
		String key="";
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		while (loop) {
			System.out.println("show:表示出栈");
			System.out.println("exit:退出程序");
			System.out.println("push:表示数据入栈");
			System.out.println("pop:表示数据出栈");
			System.out.println("请输入你的选择");
			key = scanner.next();
			 switch(key) {
			 case "show":
			 stack.list();
			 break;
			 case "push":
			 System.out.println("请输入一个数");
			 int value = scanner.nextInt();
			 stack.push(value);
			 break;
			 case "pop":
			 try {
				 int res = stack.pop();
				 System.out.printf("出栈的语句是%d\n",res);
			 }catch (Exception e) {
				// TODO: handle exception
				 System.out.println(e.getMessage());
			}
				case "exit":
					scanner.close();
					loop = false;
					break;
				default:
					break;
				}
			}
			System.out.println("程序退出");
		}
			 

}


