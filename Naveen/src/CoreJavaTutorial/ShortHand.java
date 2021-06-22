package CoreJavaTutorial;

public class ShortHand {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		byte b=8;
		//b=b*2.5;  //Compile time error- Change type of b to double
		b*=2.5;     //Type of b is automatically taken as Byte
		System.out.println(b);
	}

}
