import java.util.*;
class rectangle
{
	int length,breadth,area,parameter;
	rectangle()
	{}
	rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	void area()
	{
	area=length*breadth;
	System.out.println("area of rectangle is : "+area);
	}
	void parameter()
	{
		parameter=2*(length+breadth);
		System.out.println("parameter of rectangle is : "+parameter);
		
	}
}
class square extends rectangle
{
	int side;
	square()
	{}
	square(int s)
	{
		super(s,s);
	}
	void sarea()
	{
		System.out.println("area of square is : "+length*breadth);
	}
	void sparameter()
	{
		System.out.println("parameter of square is : "+4*length);
	}
}
public class prc19 
{
	public static void main(String arg[])
	{
		rectangle r=new rectangle(2,6);
		System.out.println("For rectangle: ");
		r.area();
		r.parameter();
		System.out.println();
		square s=new square(5);
		System.out.println("For square: ");
		s.sarea();
		s.sparameter();


	}
}
