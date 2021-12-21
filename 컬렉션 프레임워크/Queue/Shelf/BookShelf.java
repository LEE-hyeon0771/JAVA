package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);            //배열의 맨뒤로 들어감
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);        //맨 앞 0 인덱스를 제거 후 반환 - 맨 앞 부터 출력됨
	}

	@Override
	public int getSize() {
		
		return getCount();
	}

}
