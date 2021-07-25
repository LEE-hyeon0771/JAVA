package Interfaceex;

public interface Calc {
	
	double PI = 3.14;            //public static final 형태임.
	int ERROR = -999999999;
	
	int add(int num1, int num2);            //모두 public abstract 형으로 추상 메서드가 됨
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
}
