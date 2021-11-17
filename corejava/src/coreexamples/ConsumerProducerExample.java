package coreexamples;
import java.util.function.*;
public class ConsumerProducerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> pr = ()->Math.random();
				
		
		Consumer<String> c1 = str->{
			System.out.println(str+" Hello Welcome to Lambda Session");
		};
		
		c1.accept("Sunil");
		
		System.out.println(pr.get());
		System.out.println(pr.get());
		System.out.println(pr.get());

	}

}
