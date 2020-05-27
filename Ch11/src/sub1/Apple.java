package sub1;

// 항상 모든 클래스의 부모는 Object이다.
public class Apple extends Object{

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	
	public void info() {
		System.out.println("원산지 : "+country);
		System.out.println("가   격 : "+price );
	}
	
	@Override
	// Object클래스에 저장되어있는 메서드
	public String toString() {
		
		System.out.println("원산지 : "+country);
		System.out.println("가   격 : "+price );
		
		return super.toString();
	}
	
}
