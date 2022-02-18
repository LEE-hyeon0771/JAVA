package selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i<N; i++) {
			if(checkAlpha() == true) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static boolean checkAlpha() throws IOException {
		String str = br.readLine();
		
		boolean[] alpha = new boolean[26];         //���ĺ� ���� �迭
		int prevAlpha = 0;                         //���� ���ĺ�
		
		for(int i = 0; i<str.length(); i++) {
			int nowAlpha = str.charAt(i);            //üũ�� ���� ���ĺ�
			
			if(prevAlpha != nowAlpha) {              //���� ���ĺ��̶� ���� ���ĺ��� �ٸ� ���
				if(alpha[nowAlpha - 97] == false) {  //������ ������ ����(false)
					alpha[nowAlpha - 97] = true;     //�ϳ��� �׷��� �ǹǷ� true �Է�
					prevAlpha = nowAlpha;            //���� ���ĺ��� ���� ���ĺ��� �Է��ϰ� ������ üũ�� �� �ְ�
				}
				else {                      //������ ������ ����(�׷� �ܾ� �ƴϹǷ� false�� ��ȯ)
					return false;
				}
			}
		}
		return true;    //boolean�迭�� �⺻���� false�̹Ƿ� ���ڿ��� �׷�ܾ�� ���������� true�� ��ȯ
	}

}
