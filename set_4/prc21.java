import java.util.*;
class degree
{
	void getDegree()
	{
		System.out.println("I got a degree");
	}
}
class ug extends degree
{
	void getugDegree()
	{
		System.out.println("I am an Undergraduate");
		System.out.println(" ");
	}
}
class pg extends degree
{
	void getpgDegree()
	{
		System.out.println("I am postgraduate");
	}
}
class prc21
{
	public static void main(String arg[])
	{
		degree deg=new degree();
		ug u=new ug();
		pg p=new pg();
		deg.getDegree();
		u.getDegree();
		u.getugDegree();
		p.getDegree();
		p.getpgDegree();
	}
	
 }
