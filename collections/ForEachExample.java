package collections;
import java.util.*;
import java.util.function.*;
public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> f1 = n->n*n;
		Consumer<Integer> c1 = n->System.out.println(n*n);
		
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		ar.forEach(c1);

	}

}
