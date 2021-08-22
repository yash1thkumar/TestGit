package LogicalPrograms;

public class Factorial1
{

	public static void main(String[] args) 
	{
		fact(6);
	}

	static void fact(int a)
	{
		int dum=1;
		for(int i=1;i<=a;i++)
		{
			dum=dum*i;
		}
		
		System.out.println(dum);
	}
}
