package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		
		String str5 = new String("java");
		String str6 = new String("android");
		System.out.println(System.identityHashCode(str5));
		str5 = str5.concat(str6);      //str5 뒤에 str6이 붙은것이 아니라 새로운 문자열이 생성된것임.
		System.out.println(str5);
		System.out.println(System.identityHashCode(str5));
	}

}
