package firstclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main_1158 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {          //Queue �� �������� �ݺ�
			for(int i = 0; i<k-1; i++) {
				q.add(q.poll());          //poll() : Queue�� �� �� ���ڸ� �����ϰ� ����Ʈ���� �ش� ���� ����
			}                                //q�� �� �ڿ� poll�� ���� ���ڸ� ������
			list.add(q.poll());           //q.poll()�� ���� Queue�� �� �� ���ڸ� ���ο� list�� �߰�
		}
		System.out.println(list);
		
		
		
		
	}

}
