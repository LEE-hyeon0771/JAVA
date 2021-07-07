package loopexample;

public class GuGuDan {

	public static void main(String[] args) {
		
		int dan;
		int times;
		System.out.println("<< 3단 ~ 7단을 출력하는 프로그램 >>");
		
		for(dan = 3; dan <= 7; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + " = " + dan*times);
			}
		}
		System.out.println();
		
		int dan1 = 3;
		int times1 = 1;
		
		while(dan1 <= 7) {
			times1 = 1;
			while(times1 <= 9) {
				System.out.println(dan1 + "X" + times1 + " = " + dan1*times1);
				times1++;
			}
			dan1++;
			
		}
	}

}
