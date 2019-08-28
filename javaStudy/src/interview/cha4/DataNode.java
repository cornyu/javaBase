package interview.cha4;

/**
 * @author cornyu
 * @version 创建时间：2019年8月17日 下午2:16:08 
 * 
 * 类说明:链表节点
 */
public class DataNode {
	
	private int data;
	private DataNode next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DataNode getNext() {
		return next;
	}

	public void setNext(DataNode next) {
		this.next = next;
	}

	public DataNode(int data) {
		this.data = data;
	}
}
