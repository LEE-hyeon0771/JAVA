package selftest;
import java.util.*;
public class ProgrammersKakao2019_level2_openchat {
	public String[] solution(String[] record) {
	        List<String> list = new ArrayList<String>();  //��� ���� 
	        Map<String, String> map = new HashMap<String, String>();  //key = uid, value = name
	        
	        for(int i = 0; i<record.length; i++){
	            String[] arr = record[i].split(" ");
	            if(arr[0].equals("Enter")){
	                map.put(arr[1],arr[2]);
	                list.add(arr[1]);      //Enter�� �� uid����(������ �״��)
	            }
	            else if(arr[0].equals("Change")){
	                map.put(arr[1],arr[2]);
	            }
	            else{
	                list.add(arr[1]);      //Leave�� �� uid ����(������ �״��)
	            }
	        }
	        String[] answer = new String[list.size()];
	        int index = 0;
	        for (int i = 0; i<answer.length; i++){
	            String[] arr = record[i].split(" ");
	            String nickname = map.get(arr[1]);
	            
	            if (arr[0].equals("Enter")) { 
	                answer[index++] = nickname + "���� ���Խ��ϴ�.";
	            } 
	            if (arr[0].equals("Leave")) {
	                answer[index++] = nickname + "���� �������ϴ�.";
	            }
	        }
	        return answer;
	   }
}


