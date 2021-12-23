package firstclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2605 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();          //�� ������ �Է�
		
		List<Integer> list = new ArrayList<Integer>();       //���� arrayList �ϳ� ����
		
		for(int i = 1; i<=n; i++) {
			int num = input.nextInt();                     //���� ��ȣ �Է�
			if(num == 0) {                                 //0�̸� �״�� �̹Ƿ� �ٷ� add�� �־���
				list.add(i);
			}
			else {
				list.add(list.size() - num, i);           //0�ƴϸ� list�� ������� ���ڸ� ���༭ �ڿ��� ���� ����
			}                                             //add(k,index) : index�� k �ִ� �޼ҵ�
		}
		
		for(int i = 0; i<n; i++) {
			System.out.print(list.get(i) + " ");               //���� ��� ��ŭ �ε����� get�޼ҵ�� �ҷ���
		}
	}

}
