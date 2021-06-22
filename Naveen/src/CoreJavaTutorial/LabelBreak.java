package CoreJavaTutorial;

public class LabelBreak {

	public static void main(String[] args) 
	{

		kusuma:
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==2)
					break kusuma; //labeled break, without label: breaks only inner loop
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
