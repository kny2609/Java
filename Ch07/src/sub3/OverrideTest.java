package sub3;
/*
 * ��¥ : 2020/05/12
 * �̸� : �質��
 * ���� : �������̵� �޼��� �ǽ��ϱ� ���� p295
 */
public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1(); // Child - method1... ���
		child.method2(); // Child - method... ���
		child.method3(); // Parent - method... ��� 
		// Child�� method3�� �Ű����� int a�� �����Ƿ� 
		// GrandParent�� method3�� ��� Parent�� method3�� ��µȴ�.
		
		
		// final(���) : �빮�� ǥ�� 
		// - final ���� : ���
		// - final �޼��� : �������̵� ����
		// - final Ŭ���� : ��ӱ���
		final int NUM = 1;
		final double PI = 3.14;
		// NUM = 2;	����� ó�� �ʱ�ȭ�� ������ �����ȴ�.
		
		
		
	}
}
