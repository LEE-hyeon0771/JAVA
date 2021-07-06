package Chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final double PI = 3.14;    //C언어의 #define 이랑 같음 (변하지 않는 상수 - final)
		
		final int STUDENT_NUM = 30;
		int num = 0;
		if(num==STUDENT_NUM) {
			System.out.println(STUDENT_NUM);
		}
		
		System.out.println(STUDENT_NUM);

	}
}