package Interfaceex;

public interface Calc {           //인터페이스의 역할은 메서드의 명시
	
	double PI = 3.14;            //public static final 형태임.
	int ERROR = -999999999;
	
	int add(int num1, int num2);            //모두 public abstract 형으로 추상 메서드가 됨
	int substract(int num1, int num2);        
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
