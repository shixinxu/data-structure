package com.lzs.test103102;

public class QueueLink {
    // 定义一个节点内部类
    class Node {
        private Object data;
        private Node next;
        public Node(Object obj) {
            this.data = obj;
        } 
        public Node() {}
    }
    // 定义链式队列的一些属性
    private Node head; // 头指针（引用）
    private Node rear; // 尾指针（引用）
    private int length; // 队列的长度，开始为1
    private Node temp; // 临时指针（引用）
    // 初始化队列，空头指针
   public QueueLink() {
       head = new Node();
       rear = head;
       length = 1;
   }
   // 初始化队列，有数据头指针
   public QueueLink(Object obj) {
       head = new Node(obj);
       rear = head;
       length = 1;
   }
   public void clear() {
       // TODO Auto-generated method stub
       if(this.length==1){
       }else if(length==2){
           head.next=null;
           //没有引用的节点java会自动回收内存
       }else {
           while(head.next.next!=null){
               head.next=head.next.next;
           }
           head.next=null;
       }
   }
   // 判空
   public boolean isEmpty() {
       if (this.length() == 1) {
           return true;
       } else {
           return false;
       }}
   // 获得队列的长度
  public int length() {
      // TODO Auto-generated method stub
      return this.length;
  } 
  // 查看第一个节点
  public Node peek() {
      // TODO Auto-generated method stub
      if (length == 1) {

          temp=null;
      } else {

          temp= head.next;
      }
      return temp;
  }
  //删除第一个节点
  public Node poll() {         
      if(length==1){
          //无法删除
          temp=null;
           
      }else         
      if(length==2){
          this.temp= head.next;
          //置空下一个节点就可以了
          head.next=null;
          length--;
           
      }else{
          this.temp= head.next;
          this.head.next=this.head.next.next;
          length--;
      }                           
      return temp;    }
  public static void main(String[] args) {
      QueueLink linkQueue = new QueueLink();
      System.out.println("队列是否为空："+linkQueue.isEmpty());
      System.out.println("连续入队-------------------------------");
      for(int i=0;i<5;i++){
//          linkQueue.((char)(97+i));
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
