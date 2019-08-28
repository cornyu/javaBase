package base.xml;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesXml {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Properties props = new Properties();
    	props.setProperty("email.support", "donot-spam-me@nospam.com");
    	props.setProperty("name", "yujy");
 
    	//where to store?
    	OutputStream os = new FileOutputStream("src/base/xml/email-configuration.xml");
 
    	//store the properties detail into a pre-defined XML file
    	props.storeToXML(os, "Support Email","UTF-8");
 
    	System.out.println("Done");
    	
    	
    	Properties props2 = new Properties();
    	InputStream is = new FileInputStream("src/base/xml/email-configuration.xml");
    	//load the xml file into properties format
    	props2.loadFromXML(is);
    	String staff = props.getProperty("name");
    	System.out.println(staff);
    	
    	
	}

}
