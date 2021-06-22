package CoreJavaTutorial;

public class AnonymousObject 
{
	int k;
	public static void main(String[] args) 
	{
		int i=5;
		/*AnonymousObject ao=new AnonymousObject();
		System.out.println(ao.k=26);
		ao.show();*/
		System.out.println(new AnonymousObject().k=26);
		new AnonymousObject().show();

	}
	void show()
	{
		System.out.println(k);
	}
}
