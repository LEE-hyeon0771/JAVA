package selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1075 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		
		N = (N/100) * 100;         //N�� ���ڸ��� �ΰ��� 00���� ��ȯ
		StringBuilder sb = new StringBuilder();
		while(true) {
			if(N % F == 0) {
				int result = N % 100;           //N�� F�� ������ ������ �� N�� 100���� ���� ������ ���� result�� ���� - �� ���ڸ� �� ǥ��
				if(result < 10) {
					sb.append("0" + result);         //result�� 10���� ������ 02 �̷������� ǥ���ϱ� ���ؼ� �տ� 0�ٿ���
				}
				else {
					sb.append(result);
				}
				System.out.println(sb.toString());
				break;
			}
			N++;
		}
	}
}
