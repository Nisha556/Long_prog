package P1;
//Primitive types are passed by value.

public class Test1 {
	void meth(int i , int j)
	{
		i*=2;
		j/=2;
		
	}

}
class CallByValue {
	public static void main(String args[])
	{
		Test1 ob = new Test1();
		int a = 15 ;
		int b = 20;
		System.out.println(" a and b before call: " + a + 
				 " " + b);
				
		ob.meth(a ,  b);
		System.out.println(" a and b after call: " +
a + " " + b);
	}
}
