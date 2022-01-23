
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
			String str = br.readLine();
			
			String arr[] = new String[str.length()];        //str을 문자별로 잘라서 담을 배열
			if(str.equals("0")) {
				break;
			}
			for(int i = 0; i<str.length(); i++) {          //str을 substring으로 잘라서 하나씩만 arr배열에 담아줌
				arr[i] = str.substring(i,i+1);
			}
			
			List<String> list = new ArrayList<String>();  //str을 뒤집어서 담을 list
			
			for(int i = 0; i<str.length(); i++) {
				list.add(arr[str.length()-1-i]);            //list에 str을 뒤집어서 인덱스를 담아줌
			}
			
			int count = 0;
			for(int i = 0; i<str.length(); i++) {
				
				String s = list.get(i);
				if(s.contains(arr[i])) {
					count++;
				}
			}
			
			if(count == str.length()) {
				sb.append("yes" + "\n");
			}
			else {
				sb.append("no" + "\n");
			}	
		}
		System.out.println(sb.toString());
	}
}
