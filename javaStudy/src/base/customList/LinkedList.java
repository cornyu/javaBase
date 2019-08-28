package base.customList;

//import sun.net.www.content.text.plain;

/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-17 下午4:13:49 
 * 自定义单向 链表
 */
public class LinkedList<E> {
	
	//节点类
	private class Node<E>{
		public E value;
		public Node<E> next;
		public Node(E value,Node<E> next){
			this.value = value;
			this.next = next;
		}
	}
	
	private int size;
	public Node<E> head;
	
	public LinkedList(){
		head = new Node<E>(null, null);
		head.next = head;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEampty() {
		return size == 0;
	}
	
	public void  validateIndex(int index) {
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException();
		}
		return;
	}
	
	/**
     * 从链表头部添加元素
     * @param value
     */
	public void add(E value)
	{
		Node<E> cur = new Node<E>(value, head.next);
		head.next = cur;
		size ++;
		return;	
	}
	
	/**
     * 添加到链表的尾部
     * @param value
     */
	public void addLast(E value)
	{
		Node<E> node = getNode(size - 1);
		Node<E> curNode = new Node<E>(value, null);
		node.next = curNode;
		size ++;
		return;
	}
	
	/**
     * 获取位置index的节点
     * @param index
     * @return
     */
	public Node<E> getNode(int index){
		validateIndex(index);
		Node<E> cur= head.next;
		for(int i=0;i<index;i++){
			cur = cur.next;
		}
		return cur;		
	}
	
	 /**
     * 获取位置为index的节点值
     * @param index
     * @return
     */
    public E get(int index){
        return getNode(index).value;
    }
   
    /**
     * 插入一个节点
     * @param index
     * @param value
     */
    public void insert(int index,E value){

        validateIndex(index);
        if (index == 0) {
            add(value);
            return;
        }
        Node<E> preNode = getNode(index - 1);//插入位置前一个节点
        Node<E> node = getNode(index);//插入位置原始的节点，插入后为插入节点的下一个节点
        Node<E> cur = new Node<E>(value, node); //准备插入的节点
        preNode.next = cur;
        size++;
        return;
    }
    
    /**
     * 删除一个节点
     * @param index
     */
    public void delete(int index){
        validateIndex(index);
        if (index == 0) {
            head.next = head.next.next;
            size--;
            return;
        }
        Node<E> node = getNode(index - 1);
        node.next = node.next.next;
        size--;
        return;
    }

    /**
     * 删除第一个节点
     */
    public void deleteFirst(){
        delete(0);
        return;
    }
	
	
	
}
