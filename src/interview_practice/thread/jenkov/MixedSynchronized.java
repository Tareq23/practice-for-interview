package interview_practice.thread.jenkov;

public class MixedSynchronized {
	
	private static Object object = null;
	
	
	public static synchronized void setObject(Object obj) {
		object = obj;
	}
	
	public static synchronized Object getObject() {
		return object;
	}
	
	public static void setObj(Object obj) {
		synchronized (MixedSynchronized.class) {
			object = obj;
		}
	}
	
	public static Object getObj() {
		synchronized (MixedSynchronized.class) {
			return object;
		}
	}

}
