package p229;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTrunOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: "+speed+"km/h");
	}
}
