package sub2;
/*
 * 날짜 : 2020/05/14
 * 이름 : 김나연
 * 내용 : 다양한 예외처리 실습하기 교재p433
 */
public class KindOfExceptionTest {
	public static void main(String[] args) {
		
		// 배열의 크기에서 벗어난 인덱스값 참조에러
		int arr[] = new int[3];
		
		for(int i=0; i<=3; i++) {
			try {
				arr[i] = (i+1);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스값이 없습니다.");
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		// NullPoint 에러 
		// Tiger tiger; 
		// tiger변수 생성만 했기때문에 가르킬 위치가 없으므로 tiger안에는 null값이 저장되어있다.
		
		try {
			Tiger tiger = null;
		
			tiger.move();
			tiger.hunt();
		}catch(NullPointerException e) {
			System.out.println("Tiger 객체가 생성되지 않았습니다.");
		}
		
		// 캐스팅 에러
		try {
			Animal a1 = new Eagle(); // 업캐스팅(다형성)
			Animal a2 = new Shark(); // 업캐스팅(다형성)
			
			// 문법은 허용하지만 에러가 난다.
			// a1은 Eagle이기 때문에 강제로 Shark로 바꿀 수 없다.
			Shark shark = (Shark) a1; // 다운캐스팅(잘못된 캐스팅)
			shark.move();
		}catch(ClassCastException e) {
			System.out.println("캐스팅 연산이 잘못되었습니다.");
		}
		
		
		System.out.println("프로그램 종료...");
	}
}
