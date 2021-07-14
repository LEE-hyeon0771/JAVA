package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);  //int붙여주면 아스키코드값 출력
		}
	}

}
