package Interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();   //타입 상속을 받은 것   -> CompleteCalc를 new 했음
		//Calc calc1 = new Calc();    -> 인터페이스는 new 될 수 없음
		//Calc calc2 = new Calculator();  -> implements 된 것도 new 될 수 없음 
		CompleteCalc calc1 = new CompleteCalc(); //가능
		Calculator calc2 = new CompleteCalc();   //Calculator는 class 형이므로 앞에 선언 가능
		calc1.showInfo();
		//calc.showInfo(); -> Calc로 선언되어 있어서 클래스가 해당 인터페이스형으로 형 변환이 이루어지고 
		                      //이때 사용 할 수 있는 메서드는 인터페이스안의 메서드 뿐임.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num1)); 
		calc.description();    // -> new 한 클래스의 재정의 print문 출력
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);   // -> 정적 메서드 사용시 인터페이스의 이름을 그대로 가져다 사용.
		System.out.println(sum);
	}

}
