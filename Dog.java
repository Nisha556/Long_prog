package P1;
interface DogInterface
{
	public void bark()
	{
		System.out.println("Bark");
	}
	void poop();
}
abstract  class Dog {
public  void bark ()
{
	System.out.println("Bark!");
	
}
public abstract  void poop();

}
class Chihuhua extends Dog
{
	public void poop()
	{
		System.out.println("Dog pooped!");
		
	}
}
class Abstract1 extends Dog 

{
	public static void main(String args[])
	{
		Chihuhua c = new Chihuhua();
		
		c.bark();
		c.poop();
		
	}
}