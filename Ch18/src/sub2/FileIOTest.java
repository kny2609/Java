package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥ : 2020/05/21
 * �̸� : �質��
 * ���� : �ڹ� ���� ����� �ǽ��ϱ�(read, write) ���� p1021
 */
public class FileIOTest {
	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		// ���� : �뷮�� ũ�� �ð��� ���� �ɸ���.
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int value = 0;
		
		while(true) {
			// InputStream���� ������ �о���̱�
			value = fis.read();
			
			if(value == -1) {
				break;
			}
			// OutputStream���� ������ �������� 
			fos.write(value);
		}
		
		// ��Ʈ�� ����(����� �ڿ� �ݳ�)
		fis.close();
		fos.close();
		
		System.out.println("���α׷� ����...");
		
	}

}
