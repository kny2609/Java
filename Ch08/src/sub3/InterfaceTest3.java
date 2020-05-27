package sub3;
/*
 * 날짜 : 2020/05/13
 * 이름 : 김나연
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스 역할
 *  - 객체간의 결합도를 낮추는 역할
 */

// 객체간 강결합되있으면 프로그램이 딱딱해진다.
// 객체간 약결합되어있는것이 좋다. -> 인터페이스(객체간 약결합을 도와준다, 객체 사이에서 징검다리 역할)
// 객체 자체는 응집력이 있어야 한다. -> 캡슐화(응집력 높여줌)
public class InterfaceTest3 {
	public static void main(String[] args) {
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}
}
