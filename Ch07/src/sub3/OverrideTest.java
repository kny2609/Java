package sub3;
/*
 * 날짜 : 2020/05/12
 * 이름 : 김나연
 * 내용 : 오버라이드 메서드 실습하기 교재 p295
 */
public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1(); // Child - method1... 출력
		child.method2(); // Child - method... 출력
		child.method3(); // Parent - method... 출력 
		// Child의 method3는 매개변수 int a를 가지므로 
		// GrandParent의 method3를 덮어쓴 Parent의 method3가 출력된다.
		
		
		// final(상수) : 대문자 표기 
		// - final 변수 : 상수
		// - final 메서드 : 오버라이드 금지
		// - final 클래스 : 상속금지
		final int NUM = 1;
		final double PI = 3.14;
		// NUM = 2;	상수는 처음 초기화된 값으로 고정된다.
		
		
		
	}
}
