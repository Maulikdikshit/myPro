package others;

import java.util.ArrayList;
import java.util.Collections;


public class Comp {

	public static void main(String[] args)
	
	{
		ArrayList<Stu> al=new ArrayList<Stu>();  
		al.add(new Stu(101,23,"Vijay"));  
		al.add(new Stu(106,27,"Ajay"));  
		al.add(new Stu(105,21,"Jai"));  
		  
		Collections.sort(al);  
		for(Stu st:al){  
		System.out.println(st.roll+" "+st.name+" "+st.age);  
	

	}

	}
}