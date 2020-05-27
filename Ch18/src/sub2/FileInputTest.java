package sub2;

import java.io.FileInputStream;

/*
 * ��¥ : 2020/05/21
 * �̸� : �質��
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
 */
public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		try {
			// ������ ���� ��� ���� �߻� FileNotFoundException
			FileInputStream fis = new FileInputStream(file);
			int value = 0;
			
			while(true) {
				// ���Ͼȿ� ������ ���� ��� ���� �߻� IOException
				value = fis.read();
		
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				char c = (char) value;
				System.out.print(c);
			}
			// �Է½�Ʈ�� ����
			fis.close();
			
		} catch (Exception e) {
			// ����
			e.printStackTrace();
		} 
		
		System.out.println("\n���α׷� ����...");
	}
}
