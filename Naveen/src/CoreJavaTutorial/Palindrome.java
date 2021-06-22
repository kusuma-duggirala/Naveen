package CoreJavaTutorial;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int n;
		int temp,rem,rev = 0;
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
