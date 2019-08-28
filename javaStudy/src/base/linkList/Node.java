package base.linkList;

public class Node {
	 protected Node next; //指针域  
     protected long data;//数据域  
       
     public Node( long data) {  
           this. data = data;  
     }  
       
     //显示此节点  
     public void display() {  
          System. out.print( data + " ");  
     }  
}
