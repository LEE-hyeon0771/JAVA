package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student James = new Student("James",5000);
		Student Tomas = new Student("Tomas",10000);
		Student Edward = new Student("Edward",15000);
		
		Bus bus100 = new Bus(100);
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfo();
		
		Tomas.takeBus(bus100);
		Tomas.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		James.takeSubway(subwayGreen);
		James.showInfo();
		subwayGreen.showInfo();
		
		Tomas.takeSubway(subwayGreen);
		Tomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi771 = new Taxi(771);
		Edward.takeTaxi(taxi771);
		Edward.showInfo();
		taxi771.showInfo();
		
	}

}
