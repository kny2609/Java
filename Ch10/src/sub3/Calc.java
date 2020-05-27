package sub3;

public class Calc {
	// �̱��� ��ü
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}

	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	// div �޼���� ������ �߻��� �� �ִٴ� ���ɼ��� throws ������ ���� ȣ���ϴ� �ʿ� �˸�
	public int div(int x, int y) throws Exception {
		// div�ȿ��� �߻��� �� �ִ� ������ 3���� ���� throws
		
		// 1. y=-1�϶� ���⼭ ������ �߻�
		if(y<0) {
			// ���������� ���� �߻���Ŵ
			// ������ �߻��� �� �޼��带 ȣ���ϴ� ������ ������ ������. 
			Exception e = new Exception("y�� ��� �̾�� �մϴ�.");
			throw e;
		// 2. y=1�϶� ���⼭ ������ �߻�
		}else if(y==1) {
			Exception e = new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�.");
			throw e;

		}
		// 3. y=0�϶� ���⼭ ������ �߻�
		int z = x / y;
		return z;
	}
	
	
	
}
