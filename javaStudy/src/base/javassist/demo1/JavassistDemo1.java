package base.javassist.demo1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.CtNewMethod;

/**
 * @author cornyu
 * @version 创建时间：2018年3月2日 上午10:59:25 类说明 : 动态构造Class
 *          Javassist是一款字节码编辑工具，可以直接编辑和生成Java生成的字节码，以达到对.class文件进行动态修改的效果。
 *          熟练使用这套工具，可以让Java编程更接近与动态语言编程。
 */
public class JavassistDemo1 {

	public static void main(String[] args) throws Exception {
		
		ClassPool pool = ClassPool.getDefault();

		CtClass stuClass = pool.makeClass("com.ff.base.javassist.demo1.Student");

		// id属性
		CtField idField = new CtField(CtClass.longType, "id", stuClass);
		stuClass.addField(idField);

		// name属性
		CtField nameFiled = new CtField(pool.get("java.lang.String"), "name", stuClass);
		stuClass.addField(nameFiled);

		// age属性
		CtField ageField = new CtField(CtClass.intType, "age", stuClass);
		stuClass.addField(ageField);

		//age set get方法
		CtMethod getMethod = CtNewMethod.make("public int getAge() { return this.age;}", stuClass);
		CtMethod setMethod = CtNewMethod.make("public void setAge(int age) { this.age = age;}", stuClass);

		stuClass.addMethod(getMethod);
		stuClass.addMethod(setMethod);
		
		Class<?> clazz = stuClass.toClass();
        System.out.println("class:"+clazz.getName());

        System.out.println("field:---------------------");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields) {
        		System.out.println(field.getType() +"\t"+ field.getName());
        }
        
        System.out.println("method:---------------------");
        //方法
        Method[] methods = clazz.getMethods();
        for(Method method:methods) {
            System.out.println(method.getReturnType()+"\t"+method.getName()+"\t"+Arrays.toString(method.getParameterTypes()));
        }
        
        
	}

}
