package Chapter2;

public class CharacterEx {
	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch);     //char�� �״��
		System.out.println((int)ch);  //Ascii�ڵ�� �ٲ��� int��
		
		ch=66;
		System.out.println(ch);     //ch�� char������ ����Ǿ������Ƿ� ���ڿ� �ش��ϴ� �ƽ�Ű �ڵ尪
		
		int ch2 = 67;
		System.out.println(ch2);       //������ ǥ���� ch2 67
		System.out.println((char)ch2);   //char������ ǥ���Ǿ� �ƽ�Ű�ڵ�� ��ȯ�� 67�� C
	}
}
