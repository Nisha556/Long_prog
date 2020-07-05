package P1;

public class AbDemo {
public static void main(String args[])
{
	MaheshPhone obj = new SureshPhone(); // abstract class cannot instantiate the object
	obj.call();
	obj.cook();
	obj.dance();
	obj.move();
}
}
abstract class MaheshPhone  //abstract class
{
	public void call()
	{
		System.out.println("cALLING");
		
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
abstract class RameshPhone  extends MaheshPhone {     //abstract class
	public void move()
	{
		System.out.println("Moving..");
		
	}
	
}
class SureshPhone extends RameshPhone {
	public void dance()
	{
		System.out.println("Danceing");
		
	}
	
public void cook()
{
	System.out.println("cooking");
	
}
	
}

//output calling 
//cooking , dancing , Moving