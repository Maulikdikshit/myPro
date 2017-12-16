package others;

import java.util.Scanner;

public class Hack8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner scan = new Scanner(System.in);
				int b =scan.nextInt();
				scan.nextLine();
				int h=scan.nextInt();
				if(b>0 && h>0)
				{
					a=b*h;
					System.out.println(a);
				}
				else
				{
					System.out.println("java.lang.Exception: Breadth and height must be positive");
				}
				scan.close();

	}

}
