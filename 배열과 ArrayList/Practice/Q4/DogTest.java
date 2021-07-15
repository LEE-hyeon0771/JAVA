package Q4;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("개1","종1");
		dog[1] = new Dog("개2","종2");
		dog[2] = new Dog("개3","종3");
		dog[3] = new Dog("개4","종4");
		dog[4] = new Dog("개5","종5");
		
		for(int i = 0; i<dog.length;i++) {
			dog[i].showDogInfo();
		}
		System.out.println("==============");
		
		for(Dog dogarr : dog) {
			dogarr.showDogInfo();
		}
		
	}

}
