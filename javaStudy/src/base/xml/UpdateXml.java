package base.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UpdateXml {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		InputStream ipsInputStream=ReadXml.class.getResourceAsStream("staff.xml");
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document document=dBuilder.parse(ipsInputStream);
		
		System.out.println("Root element:"+document.getDocumentElement().getNodeName());
		
		NodeList nList = document.getElementsByTagName("staff");
		System.out.println("----------------------------------");
	//修改属性	
		Node  staff= nList.item(0);
		NamedNodeMap attr = staff.getAttributes();
		
		Node nodeAttr= attr.getNamedItem("id");
		System.out.println(nodeAttr.getNodeName()+","+nodeAttr.getNodeValue());
		//nodeAttr.setNodeValue("1002");
		nodeAttr.setTextContent("2");
		System.out.println(nodeAttr.getNodeName()+","+nodeAttr.getNodeValue());
	//添加 元素
		
		
		//将修改的结果 保存到 src目下的staff.xml 文件中
		// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(document);
				StreamResult result = new StreamResult(new File("src/staff.xml"));
				transformer.transform(source, result);
		 
				System.out.println("Done");
		
	}

}
