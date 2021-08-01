package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
}
public class ToStringEx {


	public static void main(String[] args) {
		Book book = new Book("두잇 자바","은종님");
		System.out.println(book);
		
		String str = new String("test");   //String 클래스는 문자열을 그대로 출력하도록 저장되어있음.
		System.out.println(str);
	}

}
