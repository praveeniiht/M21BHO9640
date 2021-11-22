package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> stu2 = new ArrayList();
		List<Integer> fours = new ArrayList();
		stu2.add(40);
		stu2.add(59);
		stu2.add(4);
		stu2.add(26);
		stu2.add(35);
		stu2.add(8);
		
		//List<Integer> result = stu2.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> result = stu2.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());
		System.out.println("The Even numbers are : "+result);
		long cnt1 = result.stream().filter(i->i%2==0).count();
		System.out.println("The even number count is : "+cnt1);
		
		List<Integer> temp = result.stream().map(i->i+10).collect(Collectors.toList());
		long cnt = result.stream().map(i->i+10).count();
		System.out.println(temp);
		System.out.println("Total elements are: "+cnt);

	}

}
