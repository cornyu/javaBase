package base.linkList;

//import org.apache.lucene.util.RamUsageEstimator;

import org.omg.CORBA.PUBLIC_MEMBER;

public class LinkList {
	 public Node first; // 定义一个头结点  
     private int pos = 0;// 节点的位置  
     public Node endNode;
  
     public LinkList() {  
           this.first = null;  
           endNode = first;
     }  
  
     // 插入一个头节点  
     public void addFirstNode( long data) {  
          Node node = new Node(data);  
          node.next = first;  
           first = node;  
     } 
     
     public void add(long data) { 
         Node node = new Node(data);  
    	if (first == null) {
			first = node;
			endNode = node;
			
		}else {
			endNode.next = node;
			endNode = node;
		}
        pos++;         
    } 
     
     public void printList(){
    	 System.out.println("队列长度："+pos);
    	 while(first!=null )
    	 {
    		 System.out.println(first.data);
    		 first = first.next;
    	 }
     }

     	   
     
    
     public static void main(String[] args) {
    	 LinkList linkList = new LinkList();
    	 Node node = new Node(10);
    	 long arr[] = new long[1];
    	 for(int i=0;i<10;i++)
    	 {
        	 linkList.add( 100);
    	 }
//    	 for(int i=0;i<20;i++)
//    	 {
//        	 linkList.add( 100);
//    	 }
    	 
    	 linkList.printList();
//    	 System.out.println( RamUsageEstimator.shallowSizeOf(linkList));
//    	 System.out.println(RamUsageEstimator.shallowSizeOf(arr));
//    	 System.out.println(RamUsageEstimator.shallowSizeOf(node));
    	// System.out.println(MyAgent.getObjectSize(linkList));

	}

}
