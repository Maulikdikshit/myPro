package pr.Patterns;

public class Pat1 {
	
	public static void main(String[] args) 
	
	{
		int lines =4;
		int times=1;
		int space=lines-1;
		for(int i=1;i<=lines;i++)
			{
			for(int k=1;k<=space;k++)
			
			{   System.out.print(" ");
			}
				for(int j=1;j<=times;j++)
				{
					System.out.print("*");
				}
				System.out.println();
				times++;
				space--;
			}
		
			}
		
		
	}


