package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	// synchronized : �ϳ��� �����常 ���ͼ� ����ǵ��� �Ѵ�.
	public synchronized void setNum() {
		num++;
	}
	
	
	
//		private void set() {
//			synchronized (this) {
//				num++;
//			}
//		}
	
	
}
