package selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int[] arr = new int[10];     //0~9 �ö�ƽ ��Ʈ
		int num = 0;
		for(int i = 0; i<N.length(); i++) {
			num = N.charAt(i) - '0';
			if(num == 9) {
				num = 6;
			}
			arr[num]++;
		}
		int temp = arr[6] + arr[9];
		if(temp % 2 == 0) {              //6�� 9�� ��Ʈ�� ������ ¦���� 6,9 �� ���� ������ 2
			arr[6] = temp/2;
		}
		else {
			arr[6] = temp/2 + 1;         //6�� 9�� ��Ʈ�� ������ Ȧ���� 6,9 �����ϰ� �� ��Ʈ�� �� �ʿ�
		}
		Arrays.sort(arr);
		
		System.out.println(arr[9]);         
	}

}
