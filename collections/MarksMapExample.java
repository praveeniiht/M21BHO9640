package collections;
import java.util.*;
public class MarksMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> stu1 = new ArrayList();
		stu1.add(80);
		stu1.add(79);
		stu1.add(63);
		
		List<Integer> stu2 = new ArrayList();
		List<Integer> fours = new ArrayList();
		stu2.add(40);
		stu2.add(59);
		stu2.add(4);
		stu2.add(26);
		stu2.add(35);
		stu2.add(8);
		for(int i =0;i<stu2.size();i++) {
			fours.add(stu2.get(i)+10);
		}
		System.out.println("The multiples of 4 are: "+fours);
		
		List<Integer> stu3 = new ArrayList();
		stu3.add(90);
		stu3.add(89);
		stu3.add(85);
		
		Map<String,List> students = new HashMap();
		students.put("Kishore",stu1);
		students.put("anil", stu2);
		students.put("kamal", stu3);
		System.out.println(students);
		

	}

}
