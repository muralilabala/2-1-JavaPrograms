import java.util.*;
class Calculate
{
	double length,width;
	void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length");
		length=s.nextDouble();
		System.out.println("Enter width:");
		width=s.nextDouble();
	}
	void area()
	{
	double area=length*width;
	System.out.println("Area="+ area);
	}
	void perimeter()
	{
	double perimeter=2*(length+width);
	System.out.println("Perimeter="+ perimeter);
	}
}
class Rect_Functions
{
	public static void main(String args[])
	{
	 Calculate rec=new Calculate();
	rec.read();
	rec.area();
	rec.perimeter();
	}	
}
	
	