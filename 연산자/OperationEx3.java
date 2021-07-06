package assignmem;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = (((num1 = num1 + 10) < 10) && ((i = i + 2) > 10));  //앞 항이 false이므로 아예 뒤에꺼 연산을 안해서 i=2 그대로 나옴
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
