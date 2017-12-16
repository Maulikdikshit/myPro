package others;

public class Stu implements Comparable<Stu>
{
	
	int age;
	int roll;
	String name;
	
	Stu(int age,int roll,String name)
	{
		this.age=age;
		this.roll=roll;
		this.name=name;
	}
	
	public int compareTo(Stu st)
	{
		if(age==st.age)
		{
			return 0;
		}
		else if(age>st.age)
		{
			
			return 1; 
		}
			else  
			return -1;  
	}
	
	

}
