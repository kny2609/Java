package sub1;
// 멤버의 타입을 치환변수로 T를 선언 
public class FruitBox<T> {
	
	// private Apple fruit;
	// private Object fruit;
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
