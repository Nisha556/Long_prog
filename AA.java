package P1;
//Create a superclass.
public class AA {

	int i ,j;
	void showij()
	{
		System.out.println("i and j : " + i + " " + j);
		
		
	}
}

class B2 extends AA {
	int k;
	void showk()
	{
		System.out.println("k: " +k);
		
	}
	void sum()
	{
		System.out.println("i+j+k: " + (i+j+k));
		
		
	}
}
class SimpleInheritance {
	public static void main(String args[])
	{
		AA superob = new AA();
		B2 subob = new B2();
		// The superclass may be used by itself.
		System.out.println("Contents of superOb: ");
		superob.i = 10;
		superob.j= 20;
		
		/* The subclass has access to all public members of
		its superclass. */
		System.out.println("Contents of subOb:");
		subob.i = 7;
		subob.j = 8;
		subob.k = 9;
		
		subob.showij();
		subob.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb:");
		subob.sum();
	}
}

//Contents of superOb: 
//Contents of subOb:
	//i and j : 7 8
	//k: 9
	//Sum of i, j and k in subOb:
		//i+j+k: 24