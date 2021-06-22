package CoreJavaTutorial;

import java.util.Scanner;

public class DecimalToBinary 
{
	static int n;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		convertToBinary(n);
		System.out.println(Integer.toBinaryString(n)); //Predefined method
	}

	public static void convertToBinary(int n)
	{
		int[] arr=new int[n];
		int i=0;
		while(n>0)
		{
			arr[i]=n%2;
			n=n/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
	}
}
