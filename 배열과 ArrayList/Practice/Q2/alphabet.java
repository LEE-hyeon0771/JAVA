package Q2;

public class alphabet {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for(int i = 0; i<alphabets.length;i++) {
			alphabets[i] = (char)(alphabets[i]-32);      //�ƽ�Ű �ڵ� �ҹ��� - 32 = �빮��
		}
		
		for(int i = 0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]);
		}
	}

}
