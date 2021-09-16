package practice;
import java.util.Scanner;

public class Practice2_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		int year = sc.nextInt();
		String animal;
		switch(year % 12) {
			case 0:
				animal = "원숭이";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 1:
				animal = "닭";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 2:
				animal = "개";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 3:
				animal = "돼지";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 4:
				animal = "쥐";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 5:
				animal = "소";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 6:
				animal = "호랑이";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 7:
				animal = "토끼";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 8:
				animal = "용";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 9:
				animal = "뱀";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 10:
				animal = "말";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			case 11:
				animal = "양";
				System.out.println(year + "년은 " + animal + "의 해입니다.");
				break;
			default:
			
			
		}
		
	}
}
