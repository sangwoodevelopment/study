package exam02;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("기본생성자 - SamsungTV");
	}
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---전원 켠다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---전원 끈다.");
			
	}
}
