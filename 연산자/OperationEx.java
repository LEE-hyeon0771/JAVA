package assignmem;

public class OperationEx {

	public static void main(String[] args) {
		int age = 24;        //대입연산자(우선순위 최하위)
		System.out.println(age);
		
		int num = 10;
		int num2 = -num;
		System.out.println(num);
		System.out.println(num2);
		
		num = -num;
		System.out.println(num);
		
	}

}
