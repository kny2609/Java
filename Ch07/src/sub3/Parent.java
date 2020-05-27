package sub3;

// 마지막 클래스가 됨으로써 상속을 할 수 없다.
public final class Parent extends GrandParent{
	
	@Override
	// final 선언을 함으로써 마지막 메서드가 된다
	// 오버라이드 당할 수 없다.
	public final void method1() {
		System.out.println("Parent - method1...");
	}
	// Overloading
	public void method2(int a) {
		System.out.println("Parent - method2...");
	}
	@Override
	public void method3() {
		System.out.println("Parent - method3...");
	}

}
