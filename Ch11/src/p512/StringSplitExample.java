package p512;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ں�-�ָ�ȣ";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
