package sub1;

// �׻� ��� Ŭ������ �θ�� Object�̴�.
public class Apple extends Object{

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	
	public void info() {
		System.out.println("������ : "+country);
		System.out.println("��   �� : "+price );
	}
	
	@Override
	// ObjectŬ������ ����Ǿ��ִ� �޼���
	public String toString() {
		
		System.out.println("������ : "+country);
		System.out.println("��   �� : "+price );
		
		return super.toString();
	}
	
}
