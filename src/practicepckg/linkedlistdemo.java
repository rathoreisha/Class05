package practicepckg;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class linkedlistdemo {
	public static void main(String[] args) {
		
		LinkedList list =new LinkedList<>();
		list.add(10);
		list.add(8);
		list.add(17);
		list.add(14);
		list.add(16);
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	    list.set(3, 20);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
//		
//		Set<Integer> s1=new HashSet<>();
//			s1.add(10);
//		s1.add(8);
//		s1.add(17);
//		s1.add(14);
//		s1.add(16);
//		System.out.println(s1);
		
	}

}
