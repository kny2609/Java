package sub1;

public class SubThread extends Thread {

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {

		for(int i=1; i<=10; i++) {
			
			// override라서 throws 선언을 할 수 없다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name+" 쓰레드 실행...");
		}
		
		System.out.println(name+" 쓰레드 종료...");
		
	}
}
