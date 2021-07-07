package ifloopAlone;

public class Practice3 {

	public static void main(String[] args) {
		System.out.println("<< 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램 >>");
		
		int dan;
		int times;
		
		for(dan = 2; dan <= 9 ;dan++) {
			for(times = 1; times <= 9;times++) {
				if(dan < times) {
					break;
				}
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
		}
	}

}
