package selftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();            //str �Է¹ޱ�
			
			String arr[] = new String[str.length()];        //str�� ���ں��� �߶� ���� �迭
			if(str.equals("0")) {                          //0�̸� break
				break;
			}
			for(int i = 0; i<str.length(); i++) {          //str�� substring���� �߶� �ϳ����� arr�迭�� �����
				arr[i] = str.substring(i,i+1);                 //type�� String������ charAt(i)�� ������ ���
			}
			
			List<String> list = new ArrayList<String>();  //str�� ����� ���� list
			
			for(int i = 0; i<str.length(); i++) {
				list.add(arr[str.length()-1-i]);            //list�� str�� ����� �ε����� �����
			}
			
			int count = 0;
			for(int i = 0; i<str.length(); i++) {
				
				String s = list.get(i);                 //list�� ��� string ���� �ϳ��� �ҷ���
				if(s.contains(arr[i])) {                 //s�� arr[i]�� ����ִٸ� count++
					count++;
				}
			}
			
			if(count == str.length()) {                 //count�� ++�Ǿ str�� ���̿� �Ȱ��ٸ� �縰��Ҽ���
				sb.append("yes" + "\n");
			}
			else {
				sb.append("no" + "\n");
			}	
		}
		System.out.println(sb.toString());            //StringBuilder�� ��Ƽ� �ѹ��� ���
	}
}
