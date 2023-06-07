package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television(); //자동형변환
		rc.turnOn();
		
		
		rc = new Audio();
		rc.turnOn();
	}

}
