import java.util.*;
class member
{
 String name;
 int age;
  int phnum;
 String add;
 long sal;
 void  printsal()
 {
	 System.out.println("The salary is "+sal);
 }
}
class emp extends member
{
	Scanner s=new Scanner(System.in);
	String spec;
	emp()
	{}
	emp(String nam,int a, int num,String addr,long salary)
	{
		name=nam;
		age=a;
		phnum=num;
		add=addr;
		sal=salary;
	}
	
	void print()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("phone number:"+phnum);
		System.out.println("Address:"+add);
		System.out.println("Salary:"+sal);
		System.out.println("enter specialzation:");
		spec=s.nextLine();
		System.out.println("Specialization:"+spec);
	}
	
}
class manager extends member
{
	Scanner s=new Scanner(System.in);
	String dept;
	manager()
	{}
	manager(String nam,int a, int num,String addr,long salary)
	{
		name=nam;
		age=a;
		phnum=num;
		add=addr;
		sal=salary;
	}
	void printdata()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("phone number:"+phnum);
		System.out.println("Address:"+add);
		System.out.println("Salary:"+sal);
		System.out.println("enter Department:");
		dept=s.nextLine();
		System.out.println("Department:"+dept);
	}
	
}
class prc18
{
	public static void main(String arg[])
	{
		emp e=new emp("James",19,2323,"Shreeji-78",50000);
		e.print();
		manager m=new manager("Jugvi",19,2121,"A21 laxminarayan society",100000);
		m.printdata();
	}
	
}
