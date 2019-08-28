package base.customList;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-18 下午1:59:51 类说明
 */
public class DoubleList<E> {

	private class Node<E> {
		public E value; // 节点值
		public Node<E> prev; // 前一个节点
		public Node<E> next; // 后一个节点

		public Node(E value, Node<E> prev, Node<E> next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}

	private int size;// 链表长度
	public Node<E> head;// 头节点
	

	/**
     * constructor
     */
    public DoubleList() {
        //头节点不存储值
        head = new Node<E>(null, null, null);
        head.prev = head.next = head;
        size = 0;
    }
    
    public int size(){
    	return size;
    }
	
    public boolean isEmpty(){
    	return size == 0;
    }
    
    /**
     * 验证索引的合法性
     * @param index
     */
    public void validateIndex(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return;
    }
    
    /**
     * 获取位置为index的节点
     * @param index
     * @return
     */
    @SuppressWarnings("unused")
	private Node<E> getNode(int index){
        validateIndex(index);
        if (index <= size/2) {
            Node<E> cur = head.next;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur;
        }
        Node<E> cur = head.prev;
        int newIndex = size - index - 1;
        for (int i = 0; i < newIndex; i++) {
            cur = cur.prev;
        }
        return cur;
    }
    
    /**
     * 获取位置为index的节点值
     * @return
     */
    public E get(int index){
        return getNode(index).value;
    }
    
    /**
     * 获取第一个节点的值
     * @return
     */
    public E getFirst(){
        return getNode(0).value;
    }
    
    /**
     * 获取最后一个节点的值
     * @return
     */
    public E getLast(){
        return getNode(size - 1).value;
    }
    
    /**
     * 插入节点
     * @param index
     * @param value
     */
    public void insert(int index, E value){
        if (index == 0) {
            Node<E> cur = new Node<E>(value, head, head.next);
            head.next.prev = cur;
            head.next = cur;
            size++;
            return;
        }

        Node<E> node = getNode(index);
        Node<E> cur = new Node<E>(value, node.prev, node);
        node.prev.next = cur;
        node.prev = cur;
        size++;
        return;
    }
    
    
    /**
     * 添加到链表的头部
     * @param value
     */
    public void addFirst(E value){
        insert(0, value);
    }


    /**
     * 添加节点到链表的尾部
     * @param value
     */
    public void addLast(E value){
        Node<E> cur = new Node<E>(value, head.prev, head);
        head.prev.next = cur;
        head.prev = cur;
        size++;
        return;
    }
    
    /**
     * 删除位置为index的节点
     * @param index
     */
    public void delete(int index){
        validateIndex(index);
        Node<E> cur = getNode(index);
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
        size--;
        cur = null;
        return;
    }
    
    /**
     * 删除第一个节点
     */
    public void deleteFirst(){
        delete(0);
        return;
    }

    
    /**
     * 删除最后一个节点
     */
    public void deleteLast(){
        delete(size - 1);
        return;
    }
    
    
    
    
	

}
