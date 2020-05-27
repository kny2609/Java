package p310;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent p = new Parent();
		Parent cc = new Child();
		
		p.method1();
		p.method2();
		
		cc.method1();
		cc.method2();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
		child.method1();
		child.method2();
		child.method3();	
	}
}
