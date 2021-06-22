package CoreJavaTutorial;

public class JavaReflection 
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		Class c=Class.forName("CoreJavaTutorial.TestForJavaReflection");
		TestForJavaReflection obj=(TestForJavaReflection)c.newInstance();
		obj.show();
	}

}
