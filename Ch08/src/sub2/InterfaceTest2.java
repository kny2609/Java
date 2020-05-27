package sub2;
/*
 * 날짜 : 2020/05/13
 * 이름 : 김나연
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스 역할
 *  - 다중상속 효과를 구현하는 역할
 */
// 자바는 다중상속이 안되지만
// 인터페이스를 통해 비슷하게 구현할 수 있다.(상속하나, 인터페이스 하나 -> 다중 부모)
public class InterfaceTest2 {
	public static void main(String[] args) {
		
		// 다형성 적용 할 수 없다.
		SmartTv stv = new SmartTv();
		stv.powerOn();
		stv.booting();
		stv.internet();
		
	}
}
