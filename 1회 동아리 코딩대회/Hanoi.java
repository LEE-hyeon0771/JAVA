package communityproject;

import java.util.Scanner;

public class Project_1 {
	
	
	
	public static void hanoi(int n, int first, int second, int third) {  //하노이의 탑 재귀함수
		
		if(n<1 || n>20) {
			System.out.println("invalid number of disc");
		}
		else if(n==1) {
			System.out.printf("%d  %d\n",first,third);
			
		}
		else {
			hanoi(n-1,first,third,second);
			System.out.printf("%d  %d\n",first,third);
			hanoi(n-1,second,first,third);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();                 //n 값을 입력받음
		
		double Answer = Math.pow(2, n) - 1;   //하노이의 탑 점화식 = 2^n - 1 이므로 Answer에 값을 담아줌
		System.out.println((int)Answer);     //Answer가 double형이므로 int형으로 강제형 변환 시켜줌
		hanoi(n,1,2,3);                    //hanoi 함수 출력
		
	}
	


}
