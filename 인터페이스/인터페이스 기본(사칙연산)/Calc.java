package Interfaceex;

public interface Calc {
	
	double PI = 3.14;            //public static final ������.
	int ERROR = -999999999;
	
	int add(int num1, int num2);            //��� public abstract ������ �߻� �޼��尡 ��
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
}
