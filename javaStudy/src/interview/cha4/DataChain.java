package interview.cha4;


/**
 * @author cornyu
 * @version 创建时间：2019年8月17日 下午2:15:09
 * 
 *          类说明 1.单链表反转; 2.判断链表是否有环
 */
public class DataChain {
	private DataNode head;

	public DataChain(int size) {
		DataNode head = new DataNode(0);
		DataNode cur = head;
		for (int i = 1; i < size; i++) {
			DataNode tmp = new DataNode(i);
			cur.setNext(tmp);
			cur = tmp;
		}
		this.head = head;
	}

	public DataNode getHead() {
		return head;
	}

	public void setHead(DataNode head) {
		this.head = head;
	}

	public static void printChain(DataNode head) {
		StringBuilder sb = new StringBuilder();
		DataNode cur = head;
		sb.append(cur.getData());
		while (null != cur.getNext()) {
			sb.append(" -> ");
			sb.append(cur.getNext().getData());
			cur = cur.getNext();
		}
		System.out.println(sb.toString());
	}

	/**
	 * 递归实现 当栈深度大于12000 则会出现StakOverflowError
	 * 
	 * @param head
	 * @return
	 */
	public static DataNode reverse1(DataNode head) {
		if (null == head || null == head.getNext())
			return head;
		DataNode revHead = reverse1(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return revHead;
	}

	/**
	 * 遍历实现 通用实现方法
	 * 
	 * @param head
	 * @return
	 */
	public static DataNode reverse2(DataNode head) {
		if (null == head || null == head.getNext())
			return head;
		DataNode pre = head;
		DataNode cur = head.getNext();
		while (null != cur.getNext()) {
			DataNode tmp = cur.getNext();
			cur.setNext(pre);
			pre = cur;
			cur = tmp;
		}
		cur.setNext(pre);
		head.setNext(null);
		return cur;
	}

	/**
	 * 判断是否存在环 步骤：设置两个指针同时指向head，其中一个一次前进一个节点（P1），另外一个一次前进两个节点(P2)。
	 * p1和p2同时走，如果其中一个遇到null，则说明没有环，如果走了N步之后，二者指向地址相同，那么说明链表存在环。
	 * 
	 * @param h
	 * @return
	 */
	public static boolean isLoop(DataNode h) {
		DataNode p1 = h;
		DataNode p2 = h;
		boolean result = false;
		while (p2.getNext() != null && p2.getNext().getNext() != null) {
			p1 = p1.getNext();
			p2 = p2.getNext().getNext();
			if (p1 == p2) {
				System.out.println(p1 + ";" + p2);
				result = true;
				break;
			}
		}
		System.out.println(p1.getData() + ";" + p2.getData());
		return result;
	}

	public static void main(String... strings) {

		DataChain chain = new DataChain(10);
		printChain(chain.getHead());

		// printChain(reverse1(chain.getHead()));

		System.out.println(isLoop(chain.getHead()));

	}

}
