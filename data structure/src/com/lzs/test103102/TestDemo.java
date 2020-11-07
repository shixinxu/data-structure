package com.lzs.test103102;

public class TestDemo {
	  public static void main(String[] args) {
	      QueueLink linkQueue = new QueueLink();
	      System.out.println("队列是否为空："+linkQueue.isEmpty());
	      System.out.println("连续入队-------------------------------");
	      for(int i=0;i<5;i++){
          //linkQueue.((char)(97+i));
	      }
	      System.out.println("队列长度为："+linkQueue.length());
	      System.out.println("队首元素为："+linkQueue.peek().data); 
	      //出队
	      System.out.println("连续出队-------------------------------");
	      for(int i=0;i<4;i++){
	          Object data=linkQueue.poll();
	      }
	      System.out.println("队列长度为："+linkQueue.length());   }


	    
	}


