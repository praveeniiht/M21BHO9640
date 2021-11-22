package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c= n->{
			for(int i=1;i<=10;i++)
			System.out.println(n +" x "+ i +" = "+(n*i));
			
		};
		
		List<Integer> stu2 = new ArrayList();
		stu2.add(3);
		stu2.add(4);
		stu2.add(5);
		stu2.add(6);
		stu2.add(7);
		stu2.add(8);
		
		stu2.forEach(System.out::println);
		stu2.forEach(c);
		

	}

}
