package interview_practice.thread.jenkov;

public class StaticSynchronizedExchanger {
	
	private static Object staticObj = null;
	public Object instanceObj = null;
	
	
	public static synchronized void setObject(Object obj) {
		staticObj = obj;
	}
	
	public static synchronized Object getObject() {
		return staticObj;
	}
	
	public  void setObj(Object obj) {
		synchronized (this) {
			this.instanceObj = obj;
		}
	}
	
	public  Object getObj() {
		synchronized (this) {
			return this.instanceObj;
		}
	}

}
