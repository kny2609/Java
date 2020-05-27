package sub1;
/*
 * 날짜 : 2020/05/13
 * 이름 : 김나연
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스 역할
 *  -클래스 설계의 표준 가이드 역할
 */
public class InterfaceTest1 {
	public static void main(String[] args) {
		// lg 참조변수 타입을 RemoteControl로 선언해주면 RemoteLG로 선언해주는 것 보다 코딩이 유연하다.
		// 참조 영역 : RemoteControl
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
	}
}
