package sub3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김나연
 * 내용 : 문자 입출력 스트림 실습하기 교재 p1025
 */
public class ReaderTest {
	public static void main(String[] args) {
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		// FileReader : file 스트림이다.
		try {
			FileReader fr = new FileReader(file);
			
			int value = 0;
			
			while(true) {
				value = fr.read();
				if(value == -1) {
					break;
				}
				char c = (char) value;
				System.out.print(c);
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
