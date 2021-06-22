package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable 
{

	public static void main(String[] args) 
	{
		List<Student2> studs=new ArrayList<>();
		studs.add(new Student2("Kusuma",76));
		studs.add(new Student2("Mounika",34));
		studs.add(new Student2("Uday",67));
		studs.add(new Student2("Bhaskar",29));
		studs.add(new Student2("Lakshmi",45));
		
		Collections.sort(studs);
		
		for(Student2 s: studs)
		{
			System.out.println(s);
		}

	}

}

class Student2 implements Comparable<Student2>
{
	String name;
	int marks;
	
	Student2(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return "Name: "+name+" Marks: "+marks;
	}

	public int compareTo(Student2 s) 
	{
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}

	
}
