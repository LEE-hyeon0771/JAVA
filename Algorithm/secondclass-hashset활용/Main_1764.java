package secondclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

class Main_1764 {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());     //�赵 ���� ���
       int m = Integer.parseInt(st.nextToken());     //���� ���� ���
       
       Set<String> set = new HashSet<String>();           //�赵 ���� ��� ���� Set - ������ �ߺ��Ǹ� �˾Ƽ� �������Ƿ� set�� ������
       List<String> list = new ArrayList<String>();       //�赵 ���� ���� ��� �־ ����� List
       
       for(int i = 0; i<n; i++) {                         //�赵 ���� ����� �Է¹��� ��ŭ set�� �߰�
    	   set.add(br.readLine());
       }
       for(int j = 0; j<m; j++) {             //���� ���� ��� ��ŭ �Է¹��� ����� bufferReader�� ��� �Ѳ����� str�� �־���
    	   String str = br.readLine();                                                   
    	   if(set.contains(str)) {            //str�� �ִ� ���ڿ��� set�� ������ ���� ��¿� list�� �����.
    		   list.add(str);
    	   }
       }
       
       Collections.sort(list);         //list�� ������������ ����
       
       bw.write(list.size() + "\n");
       for(String str : list) {
          bw.write(str + "\n");
       }
        bw.flush();
        br.close();
        bw.close();
    }
}