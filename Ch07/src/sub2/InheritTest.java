package sub2;
/*
 * 날짜 : 2020/05/12
 * 이름 : 김나연
 * 내용 : 클래스 상속 실습하기
 */
public class InheritTest {
	public static void main(String[] args) {
		
		SalaryStudent kim = new SalaryStudent("김유신", 31, "부경대", "경영학", "Samsung");
		Student lee = new Student("이순신", 25, "부산대", "경제학");
		
		kim.hello();
		lee.hello();
		
		
	}
}
