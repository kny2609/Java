package sub1;
// ����� Ÿ���� ġȯ������ T�� ���� 
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
