package sub3;
/*
 * 날짜 : 2020/05/19
 * 이름 : 김나연
 * 내용 : 스레드 활용 실습하기 교재 p576
 */
public class AddThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		// AddThread : 인터페이스로 구현했기때문에 완전한 스레드가 아니다.
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		// Thread를 여기에 생성시켜준다
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		int total = tot1 + tot2;
		
		System.out.println("전체 합 : "+total);
		
	}
}
