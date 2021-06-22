package CoreJavaTutorial;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int n;
		//int count=0;
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
