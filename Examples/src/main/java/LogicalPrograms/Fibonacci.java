package LogicalPrograms;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
//		fib(10);
		fibser(1, 20);
	}

	static void fib(int a)
	{
		int x=0;
		int y=1;
		System.out.println(x);
		System.out.println(y);
		int z=0;
		for(int i=1;i<=a;i++ )
		{
			z=x+y;
			x=y;
			y=z;
			System.out.println(z);
		}
	}
	
	static void fibser(int a,int b)
	{
		int x=0;
		int y=1;
		int z=0;
		
		for(int i=0;i<=b;i++)
		{
			z=x+y;
			x=y;
			y=z;
			if(z>=a && z<=b)
			{
				System.out.println(z);
			}
			
		}
		
	}
}
