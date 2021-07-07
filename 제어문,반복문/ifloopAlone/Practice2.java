package ifloopAlone;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("<< 구구단을 짝수 단만 출력하는 프로그램 >>");
		
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


