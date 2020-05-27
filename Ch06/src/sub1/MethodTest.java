package sub1;
/*
 * 날짜 : 2020/05/06
 * 이름 : 김나연
 * 내용 : 자바 메서드(함수) 실습하기
 */
public class MethodTest {
	public static void main(String[] args) {
		
		// 메서드 실행(호출)
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		
		int r1 = add(1, 2);
		int r2 = add(2, 3);
		int r3 = add(3, 4);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		int result = sum(1, 10);
		
		System.out.println("result : "+result);
		
		
	} // main end

	// f 메서드(함수) 정의
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	// add 메서드 정의
	public static int add(int x, int y) {	
		int z = x + y;
		return z;
	}
	
	public static int sum(int start, int end) {
		int sum = 0;
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		return sum;
	}
	
}
