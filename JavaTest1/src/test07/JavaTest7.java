package test07;
/*
 * 날짜 : 2020/05/01
 * 이름 : 김나연
 * 내용 : 자바 조건문 연습문제 
 */
public class JavaTest7 {
	public static void main(String[] args) {
		
		boolean isOk = true;
		boolean isValid = true;
		
		// isOk && isValid
		if(isOk == isValid) {
			System.out.println("isOk와 isValid 값은 true 입니다.");
		}else {
			System.out.println("isOk와 isValid 값 중 하나는 false 입니다.");
		}
	}

}
