package com.lzs.test04;

public class MyLinkedList<E> {
  //声明头节点尾节点
	private Node<E> head;
	private Node<E> last;
	private int size;
	private int modcount;
	
	public MyLinkedList() {
		head = new Node<E>();//实例头节点
		last = head;
				
	}
	public int size() {
		return size;
	}
	public Node<E> get(int index){
		if (index <0|| index >size - 1)
			return null;
		Node<E> node = head.getNext();//将头节点的下一个节点赋给Node
		for(int i=0;i<index;i++) {
			node = node.getNext();//获取node的下一个节点
		}
		return node;
	}
	public E getValue(int index) {
		if (index < 0 || index > size - 1)
			return null;
		Node<E> node = get(index);
		return node.getE();
	}
	public void add(E e) {
		Node<E> node = new Node<E>(e);//以e实例化一个节点
		last.setNext(node);//往尾节点后追加节点
		last = node;//该节点设为最后一个节点
		size++;
		modcount++;
	}
	public E add(int index,E e) {
		if(index<0 || index > size-1)
			return null;
		Node<E> node = new Node<E>(e);//实例化一个节点
		//找到插入的原节点
		Node<E> oldNode = get(index);
		if (index == 0) {//当索引为0时
			head.setNext(node);
		}else {
			//找到插入节点的上一个
			Node<E> bNode = get(index-1);
			bNode.setNext(node);
		}
		node.setNext(oldNode);
		size++;
		modcount++;
		return oldNode.getE();
	}
	public E delete(int index) {
		if (index < 0 || index > size - 1)
			return null;
		if (index == 0) {// 当索引为1，令头结点的下一个节点为头结点
			Node<E> node = head.getNext();
			head.setNext(node.getNext());
		}
		// 获取要删除节点的前一个节点
		Node<E> bNode = get(index - 1);
		// 获取要删除的节点
		Node<E> Node = bNode.getNext();
		// 获取要删除节点的下一个节点
		Node<E> nNode = Node.getNext();
		// 删除该节点
		bNode.setNext(nNode);
		Node.setNext(null);
		size++;
		modcount++;
		return Node.getE();

		}
	
	public E set(int index, E e) {
		if (index < 0 || index > size - 1)
			return null;
		// 获取指定位置的原节点
		Node<E> node = get(index);
		node.setE(e);
		modcount++;
		return node.getE();
	}
}

	


