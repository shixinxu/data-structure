package com.lzs.test103101;

public class CircleQueue {
	private int maxSize;// 数组的最大容量
	private int front;// 指向队列的头
	private int rear;// 指向队列的尾部
	private int[] arr;// 该数组用于存放队列，模拟队列

	public CircleQueue(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
		front = 0;
		rear = 0;

	}

	// 判断队列是否满
	public boolean isFull() {
		return rear == maxSize - 1;
	}

	// 判断队列是否为空
	public boolean isEmpty() {
		return rear == front;
	}

	// 添加数据到队列
	public void addQueue(int n) {
		// 判断队列是否满了
		if (isFull()) {
			System.out.println("队列满了，不能加入数据！");
		}
		// 直接将数据加入就好了
		arr[rear] = n;
		// 将rear后移此处必须取模
		rear = (rear + 1) % maxSize;

	}

	public int getQueue() {
		// 判断队列是不是空了
		if (isEmpty()) {
			// 抛出异常
			throw new RuntimeException("队列空，不能够取数据！");
		} else {
			// 这里需要分析出，front是队列第一个元素
			// 先front的对应的值保存到一个临时的变量
			// front后移
			// 将临时保存的变量返回
			int value = arr[front];
			front = (front + 1) % maxSize;
			return value;
		}

	}
	public void showQueue() {
		// 简单的遍历
		if (isEmpty()) {
			System.out.println("队列为空，没有数据!");
			return;
		}
		// 思路从front开始遍历，遍历时候要遍历多少个元素就可以了
		// 要求出当前队列的个数
		for (int i = front; i < (front + getQueueElementNumbers()); i++) {
			System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);// 注意可能会越界，所以要取模
		}
	}

	// 返回当前队列有多少元素
	public int getQueueElementNumbers() {
		return (rear + maxSize - front) % maxSize;

	}

	// 显示队列的头数据，注意不是取出数据
	public int headQueue() {
		// 判断队列已经为空就没有头数据
		if (isEmpty()) {
			System.out.println("队列空的，没有数据！");
			throw new RuntimeException("队列空的，没有数据！");
		}
		return arr[front];
	}
}
