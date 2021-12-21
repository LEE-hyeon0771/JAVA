package bookshelf;

public interface Queue {

	void enQueue(String title);       //배열의 맨 뒤로 추가로 들어감
	String deQueue();              //배열의 맨 처음 항목 반환
	int getSize();              //현재 Queue의 개수 반환
}
