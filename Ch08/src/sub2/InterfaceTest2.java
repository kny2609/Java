package sub2;
/*
 * ��¥ : 2020/05/13
 * �̸� : �質��
 * ���� : �������̽� �ǽ��ϱ�
 * 
 * �������̽� ����
 *  - ���߻�� ȿ���� �����ϴ� ����
 */
// �ڹٴ� ���߻���� �ȵ�����
// �������̽��� ���� ����ϰ� ������ �� �ִ�.(����ϳ�, �������̽� �ϳ� -> ���� �θ�)
public class InterfaceTest2 {
	public static void main(String[] args) {
		
		// ������ ���� �� �� ����.
		SmartTv stv = new SmartTv();
		stv.powerOn();
		stv.booting();
		stv.internet();
		
	}
}
