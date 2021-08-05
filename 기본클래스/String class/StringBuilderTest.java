package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str = new String("Java");
		System.out.println("str1 ���ڿ� �ּ� : " + System.identityHashCode(str));
		
		StringBuilder buffer = new StringBuilder(str);
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming");
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		
		String str1 = buffer.toString();
		System.out.println(str1);
		System.out.println("���� ������� str1�� ���ڿ� �ּ� : " + System.identityHashCode(str1));
	}

}
