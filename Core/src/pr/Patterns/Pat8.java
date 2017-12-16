package pr.Patterns;

public class Pat8 {
	
	public static void main(String[] args)
	{

	
	
	int lines =3;
	int times =1;
	int space=lines-1;
	for(int i=1;i<=lines;i++)
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
	}
}
}
