package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("토지1","박경리");
		bookArray1[1] = new Book("토지2","박경리");
		bookArray1[2] = new Book("토지3","박경리");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);     //얕은 복사
		
		for(int i = 0;i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		 
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		for(int i = 0;i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		for(int i = 0;i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		String[] strArr = new String[] {"JAVA","ANDROID","C"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
