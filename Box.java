package P1;

public class Box {
	double width;
	double height;
	double depth;
	Box (Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
		
	}
Box(double w , double h , double d)
{
	width = w; height = h;
	depth = d;
	
}
Box()
{
	width = -1; //use -1 to indicate
	height = -1;        // an uninitialized
	depth = -1;             // box
	
	
	
}
Box(double len)
{
	width = height= depth= len; //constructor used when cube is created
}
double volume() {
return width * height * depth; 
}
}
class BoxWeight extends Box {
	double weight;
	BoxWeight(double w, double h, double d, double m)
	{
		width = w;
		height = h;
		depth = d;
		weight = m;
		
	}
	
}
class DemoboxWeight {
	public static void main(String args[])
	{
		BoxWeight mybox1 = new BoxWeight(10, 10, 10, 10);
		BoxWeight mybox2 = new BoxWeight(20, 30, 10, 17.3);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of cube_mybox1 is " +  vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		
	}
}


//output Volume of mybox1 is 3000.0
// Weight of mybox1 is 34.3

// Volume of mybox2 is 6000.0
 // Weight of mybox2 is 17.3