package sub2;
/*
 * 날짜 : 2020/05/19
 * 이름 : 김나연
 * 내용 : 스레드 활용 실습하기 교재 p576
 */
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		// main은 ct1,2,3가 1000번 실행될때까지 기다리지않고 결과값을 출력하기 때문에 결과값이 계속 바뀌게 된다.
		ct1.start();
		ct2.start();
		ct3.start();
		
		// 각각의 서브 스레드가 끝나고 다시 합류
		// 동시에 num++이 되면 누락이 발생하게 된다. -> 결과가 부정확해진다.
		// 메인스레드에서 파생된 서브스레드의 작업이 완료된 후 다시 메인스레드로 합류되는 것을 실행
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("결과 : "+count.getNum());
	}
}
