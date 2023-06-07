package ch07.sec10.exam01;

public class SmartPhone extends Phone {
	
	SmartPhone(String owner) {
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 전원을 끕니다.");
	}
	
	
	
}
