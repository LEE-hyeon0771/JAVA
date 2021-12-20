package scheduler;
import java.util.Scanner;
//import java.io.IOException;
public class SchedulerTest {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		System.out.println("A : 상담원이 본인이 필요할 때 가져올 수 있는 정책");
		
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
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
