package sub1;
/*
 * ��¥ : 2020/05/19
 * �̸� : �質��
 * ���� : ������(Thread) �ǽ��ϱ� ���� p576
 * 
 * Thread 
 *  - �ϳ��� ���μ��� �ȿ��� ����Ǵ� ���� �帧
 *  - ���α׷��� ����ɶ� �����Ǵ� �����帧
 *  - Thread Ŭ������ ��ӹ޾� start() �޼���� ���꽺���� ����
 */
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
		
		// sub1.run();�� �ϳ��� ������� ����ǰ� 
		// start();�� �ϰԵǸ� ��Ƽ ������� ����ȴ�.
		// �񵿱�(Asyncronize) ������� ����
		sub1.start();
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);
			
			System.out.println("Main Thread ����...");
		}
		
		System.out.println("Main Thread ����...");
	}
}