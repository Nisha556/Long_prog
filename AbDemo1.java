package P1;

public class AbDemo1 {
public static void main(String args[])
{
	
	Iphone obj = new Iphone();
	SamsungS4 obj1 = new SamsungS4();
	show(obj);
	show(obj1);
}
public static void show(Iphone obj)
{
	obj.showConfig();
	
}
 public static void show(SamsungS4 obj)
 {
	 obj.showConfig();
	
  }
}
abstract class Phone {
	public abstract void showConfig(); 
}
class Iphone  extends Phone{
	public void showConfig()
	{
		System.out.println("2 Gb , IOS 9.3");
		
	}
}
class SamsungS4  extends Phone
{
	public void showConfig()
	{
		System.out.println("2 Gb , LOLIPOP");
		
	}
}
// 2 Gb , IOS 9.3
// 2 Gb , LOLIPOP
// 
