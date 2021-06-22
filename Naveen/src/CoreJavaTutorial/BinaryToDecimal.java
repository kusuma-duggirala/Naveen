package CoreJavaTutorial;

import java.util.Scanner;

public class BinaryToDecimal 
{
	static int b;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Number: ");
		b=sc.nextInt();
		System.out.println(convertToDecimal(b));
	}
	
	public static int convertToDecimal(int b)
	{
		int i=0,temp=0;
		int dec=0;
		while(b>0)
		{
			temp=b%10;
			dec+=Math.pow(2, i)*temp;
			b=b/10;
			i++;
		}
		return dec;
	}

}
