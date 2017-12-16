package others;

import java.util.Scanner;

public class Hack5 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
	
            int temp=a+b;
            int tem2=1;
            for(int j=0;j<n;j++)
            {
            	if(j==0)
            	{
            		System.out.print(temp);
            		System.out.print(" ");
            	}
            	else
            	{
            		for(int k=1;k<=j;k++)
            		{
            			tem2=tem2*2;
            		}
            		temp=temp+tem2*b;
            		System.out.print(temp);
            		System.out.print(" ");
            		tem2=1;
            	}
    	
            }
            System.out.println();
	           
        }
	        
	        in.close();
	    

}}
