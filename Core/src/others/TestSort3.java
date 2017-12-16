package others;
import java.util.*;  
import java.io.*;  

public class TestSort3 {

		public static void main(String args[]){  
		ArrayList<Studentt> al=new ArrayList<Studentt>();  
		al.add(new Studentt(101,"Vijay",23));  
		al.add(new Studentt(106,"Ajay",27));  
		al.add(new Studentt(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(Studentt st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		}  
		}  


