package com.lzs.test100704;



public class TestThis {

	public static void main(String[] args) {
		/* compareTo(String s) */
		/* 大于s，返回大于0的值；小于，返回小于0的值；相等，返回0。 */
		String s1 = "abc";
		String s2 = "abd";
		int result = s1.compareTo(s2); // -1

		System.out.println("result ->" + result);

		/* compareToIgnoreCase()忽略大小写 */
		String s3 = "aBc";
		String s4 = "ABC";
		result = s3.compareToIgnoreCase(s4); // 0
		System.out.println("result->" + result);
		
	}
	
}

