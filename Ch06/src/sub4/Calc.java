package sub4;

public class Calc {
	// 싱글톤 객체, 정적 필드
	private static Calc instance = new Calc();
	
	// 정적 메서드
	public static Calc getInstance() {
		return instance;
	}
	
	// 생성자
	private Calc() {
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}

}
