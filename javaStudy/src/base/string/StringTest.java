package base.string;
/**
 * 
同一个包下同一个类中的字符串常量的引用指向同一个字符串对象；
同一个包下不同的类中的字符串常量的引用指向同一个字符串对象；
不同的包下不同的类中的字符串常量的引用仍然指向同一个字符串对象；
由常量表达式计算出的字符串在编译时进行计算,然后被当作常量；
在运行时通过连接计算出的字符串是新创建的，因此是不同的；
通过计算生成的字符串显示调用intern方法后产生的结果与原来存在的同样内容的字符串常量是一样的。
 * @author xiaoyu
 *
 */
public class StringTest {
	public static void main(String args[]){
		 String str1 = "Hello";
	        String str2 = "Hello";
	       final String str3=new String("Hello");
	        System.out.println("str1 and str2 are created by using string literal.");
	        System.out.println("str1 == str2 is " + (str1 == str2));
	        System.out.println("str1.equals(str2) is " + str1.equals(str2));  
	       System.out.println(str1==str3); //false
	}
}
