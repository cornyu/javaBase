package base.relfect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//获取某个类的全部方法
public class TestReflect5 {

	public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.ff.base.relfect.TestReflect5");
        //
        Method method[] = clazz.getMethods();
        for (int i = 0; i < method.length; ++i) 
        {
            Class<?> returnType = method[i].getReturnType();
            Class<?> para[] = method[i].getParameterTypes();
            int temp = method[i].getModifiers();
            System.out.print(Modifier.toString(temp) + " "); //修饰符
            System.out.print(returnType.getName() + "  ");   //返回类型名
            System.out.print(method[i].getName() + " ");	// 方法名
            
            System.out.print("(");
            
            for (int j = 0; j < para.length; ++j)
            {
                System.out.print(para[j].getName() + " " + "arg" + j);
                if (j < para.length - 1) {
                    System.out.print(",");
                }
            }
            
            Class<?> exce[] = method[i].getExceptionTypes();
            if (exce.length > 0) 
            {
                System.out.print(") throws ");
                for (int k = 0; k < exce.length; ++k) 
                {
                    System.out.print(exce[k].getName() + " ");
                    if (k < exce.length - 1) {
                        System.out.print(",");
                    }
                }
            } else
            {
                System.out.print(")");
            }
            System.out.println();
        }
        
	}

}
