package sub6;
// 상속하기 위한 클래스
// 추상클래스는 완벽한 메서드를 가질 수 있다.
public abstract class Unit {
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	// 추상(미완성)메서드
	public abstract void attack();
	
}
