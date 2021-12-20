package scheduler;
import java.util.Scanner;
//import java.io.IOException;
public class SchedulerTest {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		System.out.println("A : ������ ������ �ʿ��� �� ������ �� �ִ� ��å");
		
		String ch = sc.nextLine();
		//ch = ch.toUpperCase();
		//int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch.equalsIgnoreCase("R")) {
			scheduler = new RoundRobin();
		}
		else if(ch.equalsIgnoreCase("L")) {
			scheduler = new LeastJob();
		}
		else if(ch.equalsIgnoreCase("P")) {
			scheduler = new PriorityAllocation();
		}
		else if(ch.equalsIgnoreCase("A")) {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
