package sub3;

// ������ Ŭ������ �����ν� ����� �� �� ����.
public final class Parent extends GrandParent{
	
	@Override
	// final ������ �����ν� ������ �޼��尡 �ȴ�
	// �������̵� ���� �� ����.
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
