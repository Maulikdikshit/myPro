package pr.Patterns;

public class Newp {

	public static void main(String[] args) {	
		
		int k = 1;
		int noOfspace = 6;
		for(int i =0;i< 4;i++) {
		for(int s=1;s<=noOfspace;s++) {
		System.out.print(" ");
		}
		k=1;
		for(int j=1; j <=(2*i+1) ; j++) {
		if(j%2 == 0 ){
		System.out.print("* ");
		}
		else 
		{
		System.out.print(k+" ");
		k++;
		}
		}
		noOfspace = noOfspace-2;
		k=1;
		System.out.println();
		} 
		}
		}

