package P1;

public class Student  extends Person {
private int StudentId;
public Student(String nm, String gen, int id)
{
	super(nm ,gen);
	this.StudentId = id;
	
}
public void Studying()
{
	if(StudentId ==0)
	{
		System.out.println("Not studing");
		
	}
	else {
		System.out.println("Bechalor of Engineering");
		
	}
}
public static void main(String args[])
{
	Person stud = new Student("Nisha", "F",0);
	Person stud1 = new Student("Nina", "F",1);
	Person stud2 = new Student("Somya", "F",3);
	stud.Studying();
	stud1.Studying();
	stud2.Studying();
	

	
	
}
}
