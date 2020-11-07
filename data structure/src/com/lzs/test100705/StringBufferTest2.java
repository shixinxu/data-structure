package com.lzs.test100705;

public class StringBufferTest2 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 12, 21, 33, 9, 2 };
		// 方式1：定义功能，使用String做拼接
		String s1 = arrayToString(arr);
		System.out.println("String拼接的方法：" + s1);

		// 方式2：定义功能能，使用StringBuffer做拼接
		String s2 = arrayToString2(arr);
		System.out.println("StringBuffer拼接的方法：" + s2);

	}
	public static String arrayToString(int[] arr) {
		// 定义一个[的字符串
		String s = "[";
		// 进行数组的遍历以及转换为字符串
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				s += arr[x] + "]";
			} else {
				s += arr[x] + ",";
			}
		}
		return s;
	}

	public static String arrayToString2(int[] arr) {

		// 定义一个"["的StringBuffer的缓冲区
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		// 进行数组的遍历，以及转换为StringBuffer缓冲区
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]);
			} else {
				sb.append(arr[x]).append(",");
			}
		}
		sb.append("]");
		// StringBuffer 转换成 String
		return sb.toString();
	}

}
