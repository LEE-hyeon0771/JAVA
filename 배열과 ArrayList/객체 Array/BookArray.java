package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		//��ü �迭�� ��쿡�� ������ ��ü�� ��� ���� �� �ν��Ͻ����� �ϳ��ϳ� �� �־������
		library[0] = new Book("���̾�1","�츣���켼");
		library[1] = new Book("���̾�2","�츣���켼");
		library[2] = new Book("���̾�3","�츣���켼");
		library[3] = new Book("���̾�4","�츣���켼");
		library[4] = new Book("���̾�5","�츣���켼");
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);    //�ڸ��� ���������Ƿ� null�� ��µ� + ��ü �ν��Ͻ��� �־��ָ� �ּҰ��� ��µ�
		}
		for(int i = 0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
		
	}

}
