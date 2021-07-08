package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
		
		int minus = substractNum(num1, num2);
		System.out.println(minus);
		
		int multiple = multipleNum(num1, num2);
		System.out.println(multiple);
		
		int divide = divisionNum(num1, num2);
		System.out.println(divide);
	}
	
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int substractNum(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int multipleNum(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int divisionNum(int n1, int n2) {
		int result = n2 / n1;
		return result;
	}


}
