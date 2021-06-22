package CoreJavaTutorial;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		int n;
		int a=1,b=1;
		int c = 0;
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		while((a+b)<=n)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
