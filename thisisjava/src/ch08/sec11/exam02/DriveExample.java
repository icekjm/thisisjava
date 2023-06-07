package ch08.sec11.exam02;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		// 버스 5대, 택시 5대
		Bus[] bus = new Bus[5];
		Taxi[] taxi = new Taxi[5];
		

	}

}
