package Chapter2;

public class CharacterEx {
	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch);     //char형 그대로
		System.out.println((int)ch);  //Ascii코드로 바꿔진 int형
		
		ch=66;
		System.out.println(ch);     //ch는 char형으로 선언되어있으므로 숫자에 해당하는 아스키 코드값
		
		int ch2 = 67;
		System.out.println(ch2);       //정수로 표현된 ch2 67
		System.out.println((char)ch2);   //char형으로 표현되어 아스키코드로 변환된 67값 C
	}
}
