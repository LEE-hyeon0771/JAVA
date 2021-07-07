package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		int month = 10;
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
		break;
		
		case 2: day = 28;
		break;
		
		case 4: case 6: case 9: case 11: day = 30;
		break;
		default:
			break;
		}
		System.out.println(month+ "월은 " + day + "일 까지 있습니다.");
		
		int floor = 5;
		
		switch(floor) {
		case 1: floor = 1;
		System.out.println("약국입니다.");
		break;
		case 2: floor = 2;
		System.out.println("정형외과입니다.");
		break;
		case 3: floor = 3;
		System.out.println("피부과입니다.");
		break;
		case 4: floor = 4;
		System.out.println("치과입니다.");
		break;
		case 5: floor = 5;
		System.out.println("헬스 클럽입니다.");
		break;
		
		
		}
		

}
}