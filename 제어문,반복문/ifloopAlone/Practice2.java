package ifloopAlone;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("<< �������� ¦�� �ܸ� ����ϴ� ���α׷� >>");
		
		int dan;
		int times;
		
		for(dan=2;dan<=9;dan++) {
			if(dan%2 != 0) {
				continue;
			}
			for(times=1;times<=9;times++) {
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			
		}
	}
}


