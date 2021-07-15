package Q2;

public class alphabet {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for(int i = 0; i<alphabets.length;i++) {
			alphabets[i] = (char)(alphabets[i]-32);      //아스키 코드 소문자 - 32 = 대문자
		}
		
		for(int i = 0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]);
		}
	}

}
