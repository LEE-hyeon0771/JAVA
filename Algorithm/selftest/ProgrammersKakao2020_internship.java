package selftest;

import java.util.*;
public class ProgrammersKakao2020_internship {
	 public int[] solution(String[] gems) {
	        Set<String> set = new HashSet<String>();
	        
	        for(int i = 0; i<gems.length; i++){
	            set.add(gems[i]);   //�ߺ� ���� ���� ���
	        }
	        
	        int start = 0;  //������ - �����
	        int temp = 0;   //������ - �ӽÿ�
	        int end = gems.length;   //����
	        
	        Map<String, Integer> map = new HashMap<>();  //key�� ����, value�� ����
	        Queue<String> q = new LinkedList<>();
	        
	        for(int i = 0; i<gems.length; i++){
	           if(map.containsKey(gems[i])) {
	                map.put(gems[i], map.get(gems[i]) + 1);
	            } 
	            else {
	                 map.put(gems[i], 1);
	            } //�ߺ����� ������ map�� ���ԵǸ� value�� +1, �ƴϸ� �״�� 1
	            q.add(gems[i]);
	            
	            while(true){
	                String gem = q.peek(); //gem�� ����
	                if(map.get(gem) > 1){    //������ 1������ �� ����(�ߺ�)
	                    q.poll(); //�ߺ��� ����
	                    map.put(gem, map.get(gem) -1);   //���� ���� -1
	                    temp++;
	                }
	                else{
	                    break;
	                }
	            }
	           
	            
	            if(set.size() == map.size()){
	                if(end > q.size()){
	                    end = q.size();
	                    start = temp;
	                }
	            }
	        }  
	            int[] answer = new int[2];
	            answer[0] = start + 1;
	            answer[1] = start + end;
	        
	            return answer;
	            
	        }
	}
   