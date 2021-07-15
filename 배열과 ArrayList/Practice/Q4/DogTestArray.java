package Q4;

import java.util.ArrayList;

public class DogTestArray {

	public static void main(String[] args) {
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("강아지1","강아지종1"));
		list.add(new Dog("강아지2","강아지종2"));
		list.add(new Dog("강아지3","강아지종3"));
		list.add(new Dog("강아지4","강아지종4"));
		list.add(new Dog("강아지5","강아지종5"));
		
		for(int i = 0; i<list.size();i++) {      //ArrayList일때 length표현법은 list명.size()
			Dog dog = list.get(i);				 //list.get(i)로 해주어야함
			dog.showDogInfo();
		}
		System.out.println("===============");
		
		for(Dog dog : list) {
			dog.showDogInfo();
		}
	}

}
