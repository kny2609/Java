package sub3;
/*
 * ��¥ : 2020/05/13
 * �̸� : �質��
 * ���� : �������̽� �ǽ��ϱ�
 * 
 * �������̽� ����
 *  - ��ü���� ���յ��� ���ߴ� ����
 */

// ��ü�� �����յ������� ���α׷��� ����������.
// ��ü�� ����յǾ��ִ°��� ����. -> �������̽�(��ü�� ������� �����ش�, ��ü ���̿��� ¡�˴ٸ� ����)
// ��ü ��ü�� �������� �־�� �Ѵ�. -> ĸ��ȭ(������ ������)
public class InterfaceTest3 {
	public static void main(String[] args) {
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}
}
