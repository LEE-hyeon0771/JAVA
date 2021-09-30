package practice3;
import java.util.Scanner;
public class Practice3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int total = 0 ;
		while(i<5) {
			int num1 = (int)(Math.random()*9 + 1);
			int num2 = (int)(Math.random()*9 + 1);
			
			int swap;
			if(num1 < num2) {
				swap = num1;
				num1 = num2;
				num2 = swap;
			}
		 
			System.out.printf("%d - %d ? ",num1,num2);
			int answer = sc.nextInt();
			
			if(num1 - num2 == answer) {
				System.out.print("정답입니다.");
				total++;
			}
				
				
			
			if(num1 - num2 != answer){
				System.out.printf("틀렸습니다. %d - %d는 %d입니다.",num1,num2,num1-num2);
				
			}
			i++;
			
		}
		System.out.println("Game Over!");
		System.out.printf("총 5문제 중 %d문제를 맞췄습니다.", total);
	}
}
