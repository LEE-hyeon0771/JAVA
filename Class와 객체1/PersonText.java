package classpart;

public class PersonText {

	public static void main(String[] args) {
		
		Person James = new Person();
			James.age = 40;
			James.name = "James";
			James.isMarried = true;
			James.kids = 3;
			
			System.out.println("나이 : " + James.age);
			System.out.println("이름 : " + James.name);
			System.out.println("결혼여부 : " + James.isMarried);
			System.out.println("자녀 수 : "+ James.kids);
			
			
			
		
	}

}
