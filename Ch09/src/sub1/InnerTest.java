package sub1;

import sub1.Outer.Inner;

/*
 * ��¥ : 2020/05/14
 * �̸� : �質��
 * ���� : ��øŬ���� �ǽ��ϱ� ���� p.390
 */
public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		// �ܺ�Ŭ������ ���� �����Ǿ�� ����Ŭ������ �̿��� �� �ֱ⶧���� 
		// ������ �ܺ�Ŭ���� �����ڸ� ����Ŭ���� �տ� �ٿ��ش�.
		Inner inner = out.new Inner(20);
		inner.info();
	}
}
