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
		System.out.println(month+ "���� " + day + "�� ���� �ֽ��ϴ�.");
		
		int floor = 5;
		
		switch(floor) {
		case 1: floor = 1;
		System.out.println("�౹�Դϴ�.");
		break;
		case 2: floor = 2;
		System.out.println("�����ܰ��Դϴ�.");
		break;
		case 3: floor = 3;
		System.out.println("�Ǻΰ��Դϴ�.");
		break;
		case 4: floor = 4;
		System.out.println("ġ���Դϴ�.");
		break;
		case 5: floor = 5;
		System.out.println("�ｺ Ŭ���Դϴ�.");
		break;
		
		
		}
		

}
}