package secondclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i<10; i++) {                                    
			int n = Integer.parseInt(br.readLine());         //set�ȿ����� �ߺ��Ǹ� �ڵ����� ���ܵǹǷ� 42�� ���� �������� �߰��� ���ָ�ȴ�.
			set.add(n%42);
		}
		
		br.close();
		System.out.println(set.size());           //���������� �ߺ��� ���� ���ܵǰ� ���� �ִ� set�� ������ ��¸� �ϸ� ��
	}

}
