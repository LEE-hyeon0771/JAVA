package Q4;

import java.util.ArrayList;

public class DogTestArray {

	public static void main(String[] args) {
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("������1","��������1"));
		list.add(new Dog("������2","��������2"));
		list.add(new Dog("������3","��������3"));
		list.add(new Dog("������4","��������4"));
		list.add(new Dog("������5","��������5"));
		
		for(int i = 0; i<list.size();i++) {      //ArrayList�϶� lengthǥ������ list��.size()
			Dog dog = list.get(i);				 //list.get(i)�� ���־����
			dog.showDogInfo();
		}
		System.out.println("===============");
		
		for(Dog dog : list) {
			dog.showDogInfo();
		}
	}

}
