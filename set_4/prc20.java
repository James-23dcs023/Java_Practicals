import java.util.*;
class shape
{
	void print()
	{
		System.out.println("This is shape");
	}
	
}
class rectangle extends shape
{
	void display()
	{
		System.out.println("This is rectangular shape");
	}
}
class square extends rectangle
{
	void getdata()
	{
		System.out.println("square is rectangle");
	}
}
class circle extends shape
{
	void show()
	{System.out.println("This is circular shape");}
}
class prc20
{
	public static void main(String arg[])
	{
		square s=new square();
		s.print();
		s.display();
	}
}
