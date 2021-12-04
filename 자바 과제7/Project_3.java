package homework_7;

public class Project_3 {
	public static void main(String[] args) {
	String s1 = new String("java");
	String s2 = new String("java");
	String s3 = s2;
	
	System.out.println(s1 == s2);   // == 은 주소를 비교
	System.out.println(s1.equals(s2));  //equals는 값을 비교
	System.out.println(s2 == s3);
	System.out.println(s2.equals(s3));
}
}
