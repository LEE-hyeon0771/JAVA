package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str = new String("Java");
		System.out.println("str1 문자열 주소 : " + System.identityHashCode(str));
		
		StringBuilder buffer = new StringBuilder(str);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		String str1 = buffer.toString();
		System.out.println(str1);
		System.out.println("새로 만들어진 str1의 문자열 주소 : " + System.identityHashCode(str1));
	}

}
