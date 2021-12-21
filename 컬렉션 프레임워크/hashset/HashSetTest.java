package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println(b1);
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		
		boolean b = set.add("aaa");       //Set은 중복을 허용하지 않으므로 같은 String aaa 이라서 false
		System.out.println(b);
	}

}
