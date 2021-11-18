package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;


public class ProcessiongCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c1 = n-> System.out.println(n*n);
		
		List ar = new ArrayList();
		
		
		ar.add("India");
		ar.add("Japan");
		ar.add("China");
		ar.add("Srilanka");
		ar.add("Japan");
		System.out.println(ar);
		System.out.println("Elements are displayed using simple for loop");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		System.out.println("elements are displayed using iterator class");
		
		Iterator itr = ar.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Elements displayed through forEach");
		
		ar.forEach(System.out::println);
		ArrayList ar1 = new ArrayList();
		ar1.add(1);
		ar1.add(3);
		ar1.add(5);
		
		System.out.println(ar1);
		ar1.forEach(c1);
		
		System.out.println("Elements in order..");
		ListIterator litr = ar.listIterator();
		while(litr.hasNext())
			System.out.println(litr.next());
		
	//	System.out.println(litr.next());
		System.out.println("Elements in reverse order...");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
	}

}
