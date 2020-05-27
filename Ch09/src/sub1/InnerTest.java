package sub1;

import sub1.Outer.Inner;

/*
 * 날짜 : 2020/05/14
 * 이름 : 김나연
 * 내용 : 중첩클래스 실습하기 교재 p.390
 */
public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		// 외부클래스가 먼저 생성되어야 내부클래스를 이용할 수 있기때문에 
		// 생성된 외부클래스 생성자를 내부클래스 앞에 붙여준다.
		Inner inner = out.new Inner(20);
		inner.info();
	}
}
