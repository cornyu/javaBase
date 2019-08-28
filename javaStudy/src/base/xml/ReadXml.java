package base.xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/**
 * getElementsByTagName
 * @author xiaoyu
 *
 */
public class ReadXml {
	public static void main(String[] args) throws Exception {
		//File fxmlFile=new File("../base/xml/staff.xml");
		
		File fxmlFile=new File("src/staff.xml");
		InputStream ipsInputStream=ReadXml.class.getResourceAsStream("staff.xml");
		
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		
		Document document=dBuilder.parse(fxmlFile);
		
		System.out.println("Root element:"+document.getDocumentElement().getNodeName());
		
		NodeList nList = document.getElementsByTagName("staff");
		System.out.println("----------------------------------");
		
		for(int i=0;i<nList.getLength();i++){
			Node nNode = nList.item(i);
			 
			System.out.println("Current Element :" + nNode.getNodeName()+"; nodeNamespaceURI:"+nNode.getNamespaceURI()+"; nodeType:"+nNode.getNodeType());
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
	 
			}
		}
		
		
	}

}
