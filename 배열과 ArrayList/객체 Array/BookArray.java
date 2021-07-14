package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		//객체 배열의 경우에는 각각의 객체가 어떻게 사용될 지 인스턴스들을 하나하나 다 넣어줘야함
		library[0] = new Book("데미안1","헤르만헤세");
		library[1] = new Book("데미안2","헤르만헤세");
		library[2] = new Book("데미안3","헤르만헤세");
		library[3] = new Book("데미안4","헤르만헤세");
		library[4] = new Book("데미안5","헤르만헤세");
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);    //자리만 생성했으므로 null로 출력됨 + 객체 인스턴스를 넣어주면 주소값이 출력됨
		}
		for(int i = 0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
		
	}

}
