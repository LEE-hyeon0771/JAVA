package communityproject;

import java.util.Scanner;

public class Project_1 {
	
	
	
	public static void hanoi(int n, int first, int second, int third) {  //�ϳ����� ž ����Լ�
		
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
		int n = sc.nextInt();                 //n ���� �Է¹���
		
		double Answer = Math.pow(2, n) - 1;   //�ϳ����� ž ��ȭ�� = 2^n - 1 �̹Ƿ� Answer�� ���� �����
		System.out.println((int)Answer);     //Answer�� double���̹Ƿ� int������ ������ ��ȯ ������
		hanoi(n,1,2,3);                    //hanoi �Լ� ���
		
	}
	


}
