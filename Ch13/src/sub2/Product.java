package sub2;
// 치환변수 두개를 갖는 제네릭 클래스
public class Product<A,B> {
	
	private A item;
	private B info;
	
	public Product (A itme, B info) {
		this.item = item;
		this.info = info;
	}
	
	public void show() {
		System.out.println("제품 종류 : "+item);
		System.out.println("제품 정보 : "+info);
	}

}
