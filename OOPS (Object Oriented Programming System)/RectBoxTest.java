class Rectangle
{
	double length;
	double breadth;
	Rectangle()
	{
		length = breadth = 0.0;
	}
	Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	double get_length()
	{
		return length;
	}
	double get_breadth()
	{
		return breadth;
	}
	double find_area()
	{
		return length * breadth;
	}
}
class Box extends Rectangle
{
	double height;
	Box()
	{
		super();
		height=0.0;
	}
	Box(double length,double breadth,double height)
	{
		super(length,breadth);
		this.height = height;
	}
	double find_volume()
	{
		return length * breadth * height;
	}
}
class RectBoxTest
{
	public static void main(String ar[])
	{
		Box b = new Box(20,30,40);
		System.out.println("Length:"+b.get_length());
		System.out.println("Breadth:"+b.get_breadth());
		System.out.println("Area:"+b.find_area());
		System.out.println("Volume:"+b.find_volume());
	}
}