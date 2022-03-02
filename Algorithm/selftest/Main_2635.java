package selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_2635 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> max = new ArrayList<>();     //max ���� ��¿�
		int maxnum = 0;                            //maxnum 8 ��¿�
		for(int i = 1; i<=N; i++) {
			List<Integer> now = new ArrayList<>();        //���� ó�� ����Ʈ
			now.add(N);
			now.add(i);
			int first = N;
			int second = i;
			
			while(true) {                             //���� �� ��ü�ذ��鼭 ��-�� ���� �����
				int result = first - second;
				if(result >= 0) {
					now.add(result);
				}
				else {
					break;
				}
				
				first = second;
				second = result;
			}
			
			if(max.size() <= now.size()) {              //�ִ���� ���� ó�� ����Ʈ ũ�⺸�� �� �۰� �� ���
				maxnum = now.size();               //�ִ���� ���� ó�� ����Ʈ ũ�Ⱑ �ǰ� �׳� �ִ� list�� ���� ó�� list�� now�� �ȴ�.
				max = now;
			}
		}
		System.out.println(maxnum);
		for(int i = 0; i<max.size(); i++) {
			System.out.print(max.get(i) + " ");
		}
	}
}
