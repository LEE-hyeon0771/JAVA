package Chapter2;

public class DoubleEx {

	public static void main(String[] args) {
		double dNum = 3.14;
		float fNum = 3.14F;   //float은 자바에서는 뒤에 F붙여줘야함. 
		
		var nNum = 3.14;   
		var Num = 10;    //var은 알아서 자료형 보고 컴파일러가 추측
		// float Num; 이렇게 다시 같은 변수로 다른 자료형 X
		System.out.println(dNum);
		System.out.println(fNum);
		System.out.println(nNum);
		System.out.println(Num);
	}

}
