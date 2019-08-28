package test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/** 
* @author cornyu 
* @version 创建时间：2018年1月16日 下午5:35:24 
* 类说明 
*/
public class TestRunnable implements Runnable{

	public List listtm;

	public TestRunnable(List list) {
		this.listtm = list;
	}
	
	@Override
	public void run() {
		
		this.listtm.add("3");
		
		System.out.println("runnable:"+this.listtm);
		
		HttpServletRequest request = null ;
		HttpSession session = request.getSession();
		
	}

}
