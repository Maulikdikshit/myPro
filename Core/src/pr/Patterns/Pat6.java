package pr.Patterns;

public class Pat6 {

	public static void main(String[] args)
	{
	
		
		int lines =4;
		int times =1;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=times;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			times++;
		}

	}

}
