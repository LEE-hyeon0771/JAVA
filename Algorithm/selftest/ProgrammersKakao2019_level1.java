package selftest;

public class ProgrammersKakao2019_level1 {
	    public int[] solution(int N, int[] stages) {
	        double[] failrates = new double[N];   //������
	        
	        for(int i = 1; i<=N; i++){
	            double nonpasser = 0;    //���޸� �������� ����
	            double passer = 0;       //�Ѿ�� �н� �������� ����
	            
	            for(int j = 0; j<stages.length; j++){
	                if(i == stages[j]){        //���޸� ���� ī��Ʈ
	                    nonpasser++;
	                }
	                if(i <= stages[j]){        //�Ѿ �н� ���� ī��Ʈ
	                    passer++;
	                }
	            }
	            
	            if(nonpasser == 0){         //�������� ���޸� �� ����� ������
	                failrates[i-1] = 0;     //������ 0
	                continue;
	            }
	            failrates[i-1] = nonpasser/passer;   //������ ����
	        }
	        
	        int[] result = new int[N];       
	        
	        for(int i = 0; i<failrates.length; i++){
	            double max = -1;
	            int index = 0;
	            
	            for(int j = 0; j<failrates.length; j++){    //������ max�� ã��
	                if(max < failrates[j]){
	                    max = failrates[j];
	                    index = j;          //max �ε����� index�� ����
	                }
	            }
	            failrates[index] = -1;       //��� �ݺ��ؼ� for�� �ȿ��� ã�� �� �ֵ��� -1�� �ٽ� ����  
	            result[i] = index+1;
	        }
	        return result;
	    }
	}

