package others;

import java.util.ArrayList;

public class Studentsadd {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		s1.name="Max";
		s1.age=23;
		s1.per=60;
		
		
		Student s2=new Student();
		s2.name="Pax";
		s2.age=21;
		s2.per=50;
		
		Student s3=new Student();
		s3.name="Bax";
		s3.age=22;
		s3.per=40;
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i).age);
	System.out.println(al.get(i).name);
	System.out.println(al.get(i).per);
}
	}

}
