package sub1;
/*
 * ��¥ : 2020/05/20
 * �̸� : �質��
 * ���� : ���׸� �ǽ��ϱ� ���� p654
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("�ѱ�", 3000);
		Banana b = new Banana("�븸", 2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		// FruitBox�� apple�� ������ ������ ���־��� ������ FruitBox���� apple�� �� �� �ִ�.
		// ������ �Ҷ� object�� �ϸ� apple�� banana ��� �� �� �ִ�.
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		
	}
}
