package selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int i = M; i<=N; i++) {
			boolean prime = true;
			if(i == 1) {
				continue;
			}
			for(int j = 2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {
					prime = false;                 //�Ҽ��� �ƴϴ�
				}
			}
			if(prime) {                     //�Ҽ��̸�
				sum += i;                   //��
				list.add(i);                //����Ʈ�� �Ҽ� �� ���
				min = list.get(0);          //����Ʈ �� ���ڸ��� ���� �Ҽ� �� �ּڰ�
			}
		}
		
		if(sum == 0) {                      //�Ҽ��� ���� �� -1
			System.out.println(-1);
		}
		else {                              //�Ҽ��� ���� �� ��, �ּڰ� ���
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
