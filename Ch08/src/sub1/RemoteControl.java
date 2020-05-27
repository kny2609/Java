package sub1;
//추상클래스는 완벽한 메서드를 가질 수 있지만 인터페이스는 추상메서드만 가질 수 있다.
public interface RemoteControl {
		
	public abstract void powerOn();
	public abstract void powerOff();
	
	// abstract 생략가능
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}
