package abstractex;

public abstract class Computer {
	
	public abstract void display();       //구현 코드가 없으므로 추상 메서드가 됨
	public abstract void typing();           //추상클래스는 상속을 위해 만드는 클래스
                                             //상속 받은 클래스에서 구현함.(하위 클래스에 구현을 위임시켰다.)
	
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
