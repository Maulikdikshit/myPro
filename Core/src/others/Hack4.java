package others;

import java.util.Scanner;

public class Hack4 {
	
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1; i<=10; i++)
        {
        	int j=N*i;
            System.out.println(N+"*"+i+"="+j);
        }
        in.close();
    }

}
