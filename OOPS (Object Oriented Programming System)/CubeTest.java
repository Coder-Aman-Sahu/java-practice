class Point
{
	Point()
	{
		System.out.println("Point Class");
	}
}
class Line extends Point
{
	Line()
	{
		System.out.println("Line Class");
	}
}
class Rect extends Line
{
	Rect()
	{
		System.out.println("Rectangle Class");
	}
}
class Cube extends Rect
{
	Cube()
	{
		System.out.println("Cube Class");
	}
}
class CubeTest
{
	public static void main(String ar[])
	{
		Cube c = new Cube();
	}
}