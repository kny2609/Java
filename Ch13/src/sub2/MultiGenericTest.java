package sub2;
/*
 * ��¥ : 2020/05/20
 * �̸� : �質��
 * ���� : ���׸� Ŭ���� �ǽ��ϱ� ���� p 654
 */
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		System.out.println("tv : "+tv);
		System.out.println("phone : "+phone);
		
		
		Product<Integer, TV> p1 = new Product<>(100, tv);
		// ���׸��� ��ü�� ��� 
		// int�� ��ü���� Integer 
		
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		p2.show();
	}
}
