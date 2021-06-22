package CoreJavaTutorial;

//Static block is executed when the class is loaded in JVM.(Before Main)
public class StaticBlock 
{
	/*static
	{
		System.out.println("In Static Block1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main");
	}
	//We can have multiple static blocks
	static
	{
		System.out.println("In Static Block2");
	}*/
	
	//Real Time Use
	static String s="";
	
	static
	{
		s="Kusuma";
	}
	public static void main(String[] args) 
	{
		System.out.println("The value of s is: "+s);
	}
}
