package CoreJavaTutorial;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int n;
		int temp,rem,arm = 0;
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			arm=arm+rem*rem*rem;
			n=n/10;
		}
		if(temp==arm)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}

}
