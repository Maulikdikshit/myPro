package others;

import java.util.Scanner;

public class Hack7 {

	  public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
	        for(int i=1;scan.hasNext()==true;i++)
	        {
	          String a=scan.nextLine();
	          System.out.println(i+" "+a);	          
	          scan.nextLine();
	        }

		
			scan.close();

		}

}
