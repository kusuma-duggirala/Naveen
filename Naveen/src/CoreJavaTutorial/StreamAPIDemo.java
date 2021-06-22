package CoreJavaTutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values=Arrays.asList(4,5,6,7,8);
		values.forEach(i->System.out.println(i));
		values.forEach(System.out::println);
		
		Stream<Integer> s=values.stream();
		s.forEach(System.out::println);  //Works fine
		s.forEach(System.out::println);  //Exception
		

	}

}
