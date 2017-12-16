package others;

public class Studentt implements Comparable<Studentt>{

	
		int rollno;  
		String name;  
		int age;  
		Studentt(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
		}  
		  
		public int compareTo(Studentt st){  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
		}  
		}  