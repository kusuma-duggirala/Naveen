package CoreJavaTutorial;

import java.util.Scanner;

public class Swapping 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		//1
		a=a+b;
		b=a-b;
		a=a-b;
		
		//2
		c=a;
		a=b;
		b=c;
		
		//3         XOR- 00-0, 01-1, 10-1, 11-0
		a=a^b;  
		b=a^b;
		a=a^b;
		
		//4
		b=a+b-(a=b);
		
		System.out.println("The Value of a is "+a+" and b is "+b);
	}

}
