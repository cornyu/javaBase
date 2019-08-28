package test;
/** 
* @author cornyu 
* @version 创建时间：2019年7月18日 上午11:29:29 
* 类说明 
*/
public class TestObjectLock {

	public static void main(String[] args) {
		Session session = new Session("11");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (session) {
					System.out.println("session lock :"+session.getSessionID());
					try {
						Thread.sleep(5000);
						System.out.println("session unlock: "+session.getSessionID());

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("set session start ");
				session.setSessionID("2");
				System.out.println("set session end");

			}
		}).start();
		
		
	}

}

class Session{
	public String sessionID;

	public Session(String id) {
		this.sessionID = id;
	}
	
	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	
	
	
}
