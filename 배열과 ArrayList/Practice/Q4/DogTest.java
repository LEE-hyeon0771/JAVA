package Q4;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("��1","��1");
		dog[1] = new Dog("��2","��2");
		dog[2] = new Dog("��3","��3");
		dog[3] = new Dog("��4","��4");
		dog[4] = new Dog("��5","��5");
		
		for(int i = 0; i<dog.length;i++) {
			dog[i].showDogInfo();
		}
		System.out.println("==============");
		
		for(Dog dogarr : dog) {
			dogarr.showDogInfo();
		}
		
	}

}
