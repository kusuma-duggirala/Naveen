package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class StudentComparator 
{
	public static void main(String[] args) 
	{
		List<Student> studs=new ArrayList<>();
		studs.add(new Student("Kusuma",76));
		studs.add(new Student("Mounika",34));
		studs.add(new Student("Uday",67));
		studs.add(new Student("Bhaskar",29));
		studs.add(new Student("Lakshmi",45));
		
		//Comparator<Student> c=(s1,s2)->{return (s1.marks>s2.marks)?-1:s1.marks<s2.marks?1:0;};
		//Collections.sort(studs,c);
		
		Collections.sort(studs, (s1,s2)->{return (s1.marks>s2.marks)?-1:s1.marks<s2.marks?1:0;});
		
		for(Student s:studs)
		{
			System.out.println(s);
		}

	}

}

class Student 
{
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return "Name: "+name+" Marks: "+marks;
	}
}
