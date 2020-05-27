package sub3;

public class Calc {
	// 싱글톤 객체
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}

	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	// div 메서드는 에러가 발생할 수 있다는 가능성을 throws 선언을 통해 호출하는 쪽에 알림
	public int div(int x, int y) throws Exception {
		// div안에서 발생할 수 있는 에러는 3가지 따라서 throws
		
		// 1. y=-1일때 여기서 에러가 발생
		if(y<0) {
			// 강제적으로 예외 발생시킴
			// 에러가 발생할 때 메서드를 호출하는 쪽으로 에러를 던진다. 
			Exception e = new Exception("y가 양수 이어야 합니다.");
			throw e;
		// 2. y=1일때 여기서 에러가 발생
		}else if(y==1) {
			Exception e = new Exception("y는 1이 되면 안됩니다.");
			throw e;

		}
		// 3. y=0일때 여기서 에러가 발생
		int z = x / y;
		return z;
	}
	
	
	
}
