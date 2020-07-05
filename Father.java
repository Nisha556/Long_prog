package P1;

public class Father {
int a = 10;
int add(int y)
{
	int b = y;
	return(a+b);
	
}
}
interface Mother { //Interface
	int c = 30;
	void disp ();    //Abstract Method
	
}
class Son extends Father implements Mother
{
	int m = a * Mother.c; //accessing class interface variable
	int sum = add(20);
	public void disp()
	{
		System.out.println("Addition = " +sum);
		System.out.println("Multiplication = " +m);
		
	}
}
class Geekyshows {
	public static void main(String args[])
	{
		Son obj = new Son();
		obj.disp();
	}
}