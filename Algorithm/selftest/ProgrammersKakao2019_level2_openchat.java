package selftest;
import java.util.*;
public class ProgrammersKakao2019_level2_openchat {
	    public String[] solution(String[] record) {
	        List<String[]> list = new ArrayList<String[]>();  //��� ���� 
	        Map<String, String> map = new HashMap<String, String>();  //key = uid, value = name
	        for(int i = 0; i<record.length; i++){
	            String[] arr = record[i].split(" ");
	            if(arr[0].equals("Enter")){
	                map.put(arr[1],arr[2]);
	                list.add(arr);      //Enter�� �� uid����(������ �״��)
	            }
	            else if(arr[0].equals("Change")){
	                map.put(arr[1],arr[2]);
	            }
	           else{
	               
	                list.add(arr);      //Leave�� �� uid ����(������ �״��)
	           }
	        }
	        String[] answer = new String[list.size()];
	        int index = 0;
	        for (String[] result : list){
	            String nickname = map.get(result[1]);
	            
	            if (result[0].equals("Enter")) { 
	                answer[index] = nickname + "���� ���Խ��ϴ�.";
	                index++;
	            } 
	            if(result[0].equals("Leave")) {
	                answer[index] = nickname + "���� �������ϴ�.";
	                index++;
	            }
	           
	        }
	        return answer;
	    }
	}



