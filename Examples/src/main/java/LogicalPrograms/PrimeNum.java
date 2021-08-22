package LogicalPrograms;

public class PrimeNum {

	public static void main(String[] args)
	{
//		primeornot(18);
		primeseries(3,20);
	}

	static void primeornot(int a)
	{
		int count=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count=1;
			}
		}
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
	}
	
	static void primeseries(int a, int b)
	{
		int count=0;
		
		for(int i=a;i<b;i++)
		{
			count=0;
			for(int j=2;j<a;j++)
			{
				if(i%j==0)
				{
					count=1;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}
}
