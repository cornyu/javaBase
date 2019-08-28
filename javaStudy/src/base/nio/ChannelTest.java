package base.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest {

	public static void main(String[] args) throws Exception {
		System.out.println("sss");
		FileInputStream aFile = null;

		aFile = new FileInputStream("nio-data.txt");

		System.out.println("afile:" + aFile);
		FileChannel inChannel = aFile.getChannel();
		System.out.println("inChannel:" + inChannel);
		ByteBuffer buf = ByteBuffer.allocate(90);

		int bytesRead = -1;

		bytesRead = inChannel.read(buf);
		
		
		System.out.println(bytesRead);
		
		while (bytesRead != -1) {

			System.out.println("Read " + bytesRead);
			buf.flip();

			while (buf.hasRemaining()) {
				System.out.print((char) buf.get());
			}

			buf.clear();

			bytesRead = inChannel.read(buf);
		}
		aFile.close();

	}

}
