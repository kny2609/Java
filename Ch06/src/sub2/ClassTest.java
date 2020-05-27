package sub2;
/*
 * 날짜 : 2020/05/07
 * 이름 : 김나연
 * 내용 : 자바 클래스 실습하기 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// 기본타입 : int, double, boolean -> stack에 저장
		// 참조타입 : String, 배열, 객체(=참조변수) -> heap에 저장

		int num1 = 1;
		int num2 = 2;
		
		// 국민은행 객체생성 및 초기화
		// Account : 참조타입 (주소를 가진다)
		Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);
		
		// 입금, 출금, 조회하기
		kb.deposit(10000);
		kb.withdraw(5000);
		// kb.money--; // 객체의 멤버변수의 캡슐화를 통한 취약코드 예방
		kb.info();
		
		// 신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "121-11-1234", "김유신", 30000);
		
		// 입금, 출금, 조회하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
	}
}
