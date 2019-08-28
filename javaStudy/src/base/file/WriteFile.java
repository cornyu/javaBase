package base.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String str="sb";
		FileWriter fw=new FileWriter("D:\\log.txt");
		fw.write(str);
		fw.flush();
		fw.close();
		
		
	}

}
