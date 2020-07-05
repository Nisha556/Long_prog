package P1;
     
import java.util.Scanner;

public class MyProg {
public static void main(String args[])
{
	System.out.println("What's ypur Roll ?");
	Scanner sc = new Scanner(System.in);
	int  roll = sc.nextInt();
	switch(roll)
	{
	case 1 :
		System.out.println("Welcome my man");
		
		break;
	case 2 :
		System.out.println(" go away ");
		
		break;
	}
}
}

