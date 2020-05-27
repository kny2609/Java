package sub1;
/*
 * 날짜 : 2020/05/20
 * 이름 : 김나연
 * 내용 : 제네릭 실습하기 교재 p654
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("대만", 2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		// FruitBox에 apple만 변수로 선언을 해주었기 때문에 FruitBox에는 apple만 들어갈 수 있다.
		// 선언을 할때 object로 하면 apple과 banana 모두 쓸 수 있다.
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		
	}
}
