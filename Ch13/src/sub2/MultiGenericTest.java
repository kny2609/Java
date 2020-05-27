package sub2;
/*
 * 날짜 : 2020/05/20
 * 이름 : 김나연
 * 내용 : 제네릭 클래스 실습하기 교재 p 654
 */
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		System.out.println("tv : "+tv);
		System.out.println("phone : "+phone);
		
		
		Product<Integer, TV> p1 = new Product<>(100, tv);
		// 제네릭은 객체만 취급 
		// int의 객체형인 Integer 
		
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		p2.show();
	}
}
