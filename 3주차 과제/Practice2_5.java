package practice;
import java.util.Scanner;
public class Practice2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이차방정식 ax^2+bx+c=0의 계수 a,b,c를 입력하세요: ");
		
		double a,b,c;
		double root;
		double D;
		double x1, x2, x3;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		D = b*b - 4*a*c;
		root = Math.sqrt(D);
		x1 = (-b + root)/2*a;
		x2 = (-b - root)/2*a;
		if(a == 0) {
			x3 = -c/b;
			System.out.println("일차방정식의 근의 값: " + x3);
		}
		else {
			if(D > 0) {
				System.out.println("이차방정식의 근의 개수 : 2");
				System.out.println("이차방정식의 근의 값: " + x1 + "," + x2);
			}
			if(D == 0) {
				System.out.println("이차방정식의 근의 개수 : 1");
				System.out.println("이차방정식의 근의 값: " + x1);
			}
			if(D < 0) {
				
				System.out.println("허근입니다.");
			}
		}
	}
}


