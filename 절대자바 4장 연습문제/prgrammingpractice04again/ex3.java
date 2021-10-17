package prgrammingpractice04again;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		int finalnum;
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print("반대로 출력할 수 입력: ");
		value = sc.nextInt();
		System.out.print("반대로 출력한 값: ");
		
		do {
			finalnum = value % 10;
			value = value/10;
			System.out.printf("%d",finalnum);
		}
		while(value != 0);
	}

}
