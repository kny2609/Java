package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	// synchronized : 하나의 스레드만 들어와서 실행되도록 한다.
	public synchronized void setNum() {
		num++;
	}
	
	
	
//		private void set() {
//			synchronized (this) {
//				num++;
//			}
//		}
	
	
}
