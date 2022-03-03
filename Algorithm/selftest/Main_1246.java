package selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1246 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();      //Pi ���� list
		
		for(int i = 0; i<M; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		int max = 0;              //max ��°�
		int maxPi = 0;
		
		Collections.sort(list);      //list ����
		
		for(int i = 0; i<list.size(); i++) {
			int now = 0;
			int nowPi = list.get(i);      //���� Pi�� list�� ��� Pi �̾ƿ���
			
			if(M - i < N) {               //������ �� ����� N���� ���� ���� M-i��, �׷����ʴٸ� N�� �״�� ������ 
				now = nowPi * (M-i);
			}
			else {
				now = nowPi * N;
			}
			
			if(max < now) {            //max���� now�� ���� ������ max�� now���� maxPi�� nowPi ���
				max = now;
				maxPi = nowPi;
			}
		}
		System.out.print(maxPi + " " + max);
	}
}
