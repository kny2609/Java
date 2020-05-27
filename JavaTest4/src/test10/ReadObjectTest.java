package test10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectTest {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("./apple.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			
			a1.show();
			a2.show();
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("apple.text ������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
