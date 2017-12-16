package others;

public class Rec1 {
	
	static int factorial(int n){      
        if (n == 1) 
        {
          return 1;
        }
        else  
        {
        	System.out.println(n);
          return(n * factorial(n-1));
         
        }
  }      

public static void main(String[] args) {  
System.out.println("Factorial of 5 is: "+factorial(5));  
}  

}
