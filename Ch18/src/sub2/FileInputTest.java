package sub2;

import java.io.FileInputStream;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김나연
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018
 */
public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		try {
			// 파일이 없을 경우 에러 발생 FileNotFoundException
			FileInputStream fis = new FileInputStream(file);
			int value = 0;
			
			while(true) {
				// 파일안에 내용이 없을 경우 에러 발생 IOException
				value = fis.read();
		
				if(value == -1) {
					// 더 이상 읽을 데이터가 없을 경우
					break;
				}
				char c = (char) value;
				System.out.print(c);
			}
			// 입력스트림 해제
			fis.close();
			
		} catch (Exception e) {
			// 통합
			e.printStackTrace();
		} 
		
		System.out.println("\n프로그램 종료...");
	}
}
