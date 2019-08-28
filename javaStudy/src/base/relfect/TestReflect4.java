package base.relfect;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//获取某个类的全部属性
//getDeclaredFields  getFields的区别

public class TestReflect4  extends User  implements Serializable{

	private static final long serialVersionUID = 8903005937775782532L;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.ff.base.relfect.TestReflect4");
  
        System.out.println("===============本类属性===============");

        Field[] field =  clazz.getDeclaredFields();//注意 
        for(int i=0;i< field.length;i++)
        {
        	//权限修饰符
        	int mo = field[i].getModifiers();
        	String priv = Modifier.toString(mo);
        	//属性类型
        	Class<?> type  = field[i].getType();
        	
            System.out.println(priv + " " + type.getName() + " " + field[i].getName() + ";");
            //private static final long serialVersionUID;           
            
        }
        
        System.out.println("==========实现的接口或者父类的属性==========");
        //取得实现的接口或者父类的属性
        // 但是只能获取到父类的public 的属性
        Field[] field1 = clazz.getFields();
        for(int i=0;i< field1.length;i++)
        {
        	//权限修饰符
        	int mo = field1[i].getModifiers();
        	String priv = Modifier.toString(mo);
        	//属性类型
        	Class<?> type  = field1[i].getType();
        	
            System.out.println(priv + " " + type.getName() + " " + field1[i].getName() + ";");            
        }

	}

}
