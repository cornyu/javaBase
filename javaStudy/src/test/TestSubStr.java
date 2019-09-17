package test;

import java.util.Scanner;

public class TestSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abcdefghijklm";
		System.out.println(test.substring(1,3));
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		int arry[];
		String arryContent;
		if(scanner.hasNext()) {
			size= scanner.nextInt();
			System.out.println("size:"+size);
			arry = new int[size];

		}
		
		while(scanner.hasNextLine()) {
			arryContent= scanner.nextLine();
			System.out.println("content:"+arryContent);
			String arryStr[] = arryContent.split(" ");
			for(int i=0;i<arryStr.length;i++) {
				System.out.println(""+i+":"+arryStr[i]);
			}
		}

	}

}
