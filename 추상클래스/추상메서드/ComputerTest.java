package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer();  -> �߻�Ŭ������ �ν��Ͻ�ȭ �� �� ����.
		Computer c2 = new Desktop();
		//Computer c3 = new NoteBook();  -> �߻�Ŭ������ �ν��Ͻ�ȭ �� �� ����.
		Computer c4 = new MyNoteBook();
		NoteBook c5 = new MyNoteBook();
		c2.display();
		c4.display();
	}
}
