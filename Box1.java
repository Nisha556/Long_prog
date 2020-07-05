//Here, Box defines three constructors to initialize
// the dimensions of a box various ways.


package P1;

public class Box1 {
	double width; double height;double depth;
	Box1(double w, double h,  double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	
	 // constructor	used when no dimensions specified
	Box1()
	{
		width =-1;// use -1 to indicate
		
		
		height = -1;  // an uninitialized
		depth= -1; // box
		
	}
	// constructor used when cube is created
	Box1(double len)
	{
		width = height= depth= len;
		
	}
	// compute and return volume
	double volume() {
	return width * height * depth;
}
}
class OverloadCons {
public static void main(String args[]) {
	Box1 mybox1 = new Box1(10,20,15);
	Box1 mybox2 = new Box1();
	Box1 mycube = new Box1(7);
	double vol;
	vol = mybox1.volume(); // get volume of first box
	System.out.println("Volume of mybox1 is " + vol);
	vol = mybox2.volume(); //get volume of second box
	System.out.println("Volume of mybox2 is " + vol); 
	vol = mycube.volume();
	System.out.println("Volume of mycube is " + vol); //get volume of cube
}
}
// Output - Volume of mybox1 is 3000.0
//Volume of mybox2 is -1.0
//Volume of mycube is 343.0 