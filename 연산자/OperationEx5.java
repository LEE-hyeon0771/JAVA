package assignmem;

public class OperationEx5 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2;
		System.out.println(result);
		
		int result1 = num1 | num2;
		System.out.println(result1);
		
		int num3 = 5;   //00000101
		System.out.println(num3 << 1);  //num3 * 2�� ��   00001010
		System.out.println(num3 << 2);  //num3 * 4�� ��   00010100
		System.out.println(num3 << 3);  //num3 * 8�� ��   00101000
		System.out.println(num3);  //num3 ���� �ٲ��� ����
		System.out.println(num3 >> 1);   //00000010
		
		int num = 2;
		System.out.println(~num);
	}

}
