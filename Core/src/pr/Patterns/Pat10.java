package pr.Patterns;

public class Pat10
{
	
	public static void main(String[] args)
	{

	
	
	int lines =5;
	int times =1;
	int space=2;
	int mid=3;
	for(int i=1;i<=lines;i++)
	{
		
	  if(i<=mid)
	  {
		 for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=times;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		times=times+2;
		space--;
		if(times==7)
		{
			times=times-2;
			space=space+1;
		}
		
	 }
	
	
	else
	{
	
     space=space+1;
     times=times-2;
     
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=times;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
	}
}
