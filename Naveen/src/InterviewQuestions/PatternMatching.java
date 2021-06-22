package InterviewQuestions;

public class PatternMatching 
{

	static String t="kusuma";
	static String p="umu";
	public static void main(String[] args) 
	{
		int tl=t.length();
		int pl=p.length();
		boolean found=false;
		
		for(int i=0;i<=tl-pl;i++)
		{
			int count=0;
			if(t.charAt(i)==p.charAt(0))
			{
				for(int j=i,k=0;j<i+pl;j++,k++)
				{
					if(t.charAt(j)==p.charAt(k))
					{
						count++;
					}
				}
				System.out.println(count);
				if(count==pl)
				{
					found=true;
				}
			}
		}
		if(found)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
