package base.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 * 计算xml 深度
 * @author xiaoyu
 *
 */
public class XmlDepth {

	static int depthOfXML = 1;
	public static void main(String[] args) throws Exception {
		File file=new File("src/base/xml/depth.xml");
		
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document document=dBuilder.parse(file);
		
		System.out.println("Root element:"+document.getDocumentElement().getNodeName());
		
		Element elements = document.getDocumentElement();
		int level = 1;
		System.out.println(elements.getNodeName() + "[" + level + "]");
	 
		NodeList nodeList = elements.getChildNodes();
		printNode(nodeList, level);
	 
		System.out.println("The deepest level is : " + depthOfXML);
	 
		
	}
	private static void printNode(NodeList nodeList, int level) {
		level++;
		if(nodeList!=null&&nodeList.getLength()>0){
			for(int i=0;i<nodeList.getLength();i++){
				Node node=nodeList.item(i);
				if(node.getNodeType()==Node.ELEMENT_NODE){
					System.out.println(node.getNodeName() + "[" + level + "]");
					printNode(node.getChildNodes(), level);
		 
					// how depth is it?
					if (level > depthOfXML) {
						depthOfXML = level;
					}
				}
			}
		}
		
	}

}
