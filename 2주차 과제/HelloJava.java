package practice2;

public class HelloJava {
	static String name;   //정적타입의 String 변수 name을 필드변수로 선언
	public static void main(String[] args) {
		name = "Hello, Java Application!";   //name의 초기값 설정
		System.out.println(name);  //name 필드 변수 출력
	}

}
