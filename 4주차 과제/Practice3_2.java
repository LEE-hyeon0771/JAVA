package practice3;

public class Practice3_2 {

	public static void main(String[] args) {
		int i; 
		
		int total = 0;
		for(i=1;i<=100;i++) {
			if(i%3 == 0) {
				total = total + i;
			}
			
		}
		System.out.printf("1~100���� �� �� 3�� ��� ���� ��: %d",total);
	}

}
