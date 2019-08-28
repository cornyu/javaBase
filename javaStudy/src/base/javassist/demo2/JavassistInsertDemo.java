package base.javassist.demo2;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
import javassist.NotFoundException;

/** 
* @author cornyu 
* @version 创建时间：2018年3月2日 上午11:17:45 
* 类说明 
* 动态注入代码
*/
public class JavassistInsertDemo {

	public static void main(String[] args) throws Exception {
		ClassPool pool = ClassPool.getDefault();
		
        CtClass ctClass = pool.get("com.ff.base.javassist.demo2.Calculator");

		//需要修改的方法名称
		String mname = "getSum";
		CtMethod oldMethod = ctClass.getDeclaredMethod(mname);
		
		//修改原来的方法名称
		String nname = mname + "$impl";
		oldMethod.setName(nname);
		
		CtMethod newMethod = CtNewMethod.copy(oldMethod, mname, ctClass,null);
		 // 主要的注入代码
        StringBuffer body = new StringBuffer();
        body.append("{\nlong start = System.currentTimeMillis();\n");
        // 调用原有代码，类似于method();($$)表示所有的参数
		body.append(nname + "($$);\n");
        body.append("System.out.println(\"Call to method " + mname
                + " took \" +\n (System.currentTimeMillis()-start) + " + "\" ms.\");\n");

        body.append("}");
        System.out.println("追加内容："+body.toString());
        
        //替换新方法
        newMethod.setBody(body.toString());        
        ctClass.addMethod(newMethod);
        
        Calculator calculator =(Calculator)ctClass.toClass().newInstance(); 
        calculator.getSum(3);
	
	}

}

class Calculator {

    public void getSum(long n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("n="+n+",sum="+sum);
    }
}
