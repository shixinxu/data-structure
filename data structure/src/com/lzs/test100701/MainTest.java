package com.lzs.test100701;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	public static ArrayList<Character> list = new ArrayList<Character>();
	
	public void getResult(String A) {
		char[] arrayA = A.toCharArray();
		for(int i = 0; i<arrayA.length;i++) {
			if(arrayA[i] ==  ' ')
				continue;
			char temp = arrayA[i];
			if(temp >='0' && temp <= '9') {
			}else {
				temp = (char)(temp - 32);
				list.add(temp);
			}
			if(i == arrayA.length -1)
				break;
			temp = arrayA[++i];
			while(temp != ' '){
				char t = arrayA[i - 1];
				if(t > '0' && t <= '9' && temp >= 'a' && temp <= 'z')
					list.add('_');
				else if (t >= 'a' && t <= 'z' && temp >= '0' && temp <= '9')
					list.add('_');
				list.add(temp);
				if(i == arrayA.length - 1)
					break;
				temp = arrayA[++i];
								
			} 
			list.add(' ');		
				
		}
		for(int i = 0;i < list.size();i++)
			System.out.print(list.get(i));
	}
	public static void main(String[] args) {
		MainTest test = new MainTest();
				Scanner in = new Scanner(System.in);
		String A = in.nextLine();
		test.getResult(A);
	}
}
