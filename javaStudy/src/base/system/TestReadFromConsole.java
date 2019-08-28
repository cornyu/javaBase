package base.system;

import java.io.IOException;

//从console窗口中读取到 输入字符
public class TestReadFromConsole {

	public static void main(String[] args) {
		int receive = 0;
		try {
			while((receive = System.in.read())!=-1){
				System.out.print((char)receive);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
