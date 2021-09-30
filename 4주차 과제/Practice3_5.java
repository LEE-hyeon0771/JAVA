package practice3;
import java.util.Scanner;
public class Practice3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피보나치 수열의 항 입력: ");
		int input = sc.nextInt(); 
		
		int num1 = 0;
		int num2 = 1;
		int total = 1;
		
		for(int i = 0; i<input; i++) {
			System.out.print(total+" ");
			total = num1 + num2;
			num1 = num2;
			num2 = total;
		}
	}
	

}
