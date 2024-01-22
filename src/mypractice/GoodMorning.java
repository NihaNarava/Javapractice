package mypractice;

public class GoodMorning {
public static void main(String args[]) 
{
	int x=2;
	int k=5;
	int z;
	z= x +k;
	float y =2;
	boolean name=true;
	float salary = 60000.00f;
	long t;
	double h;
	String xyz="2";
//System.out.println(name);

for( int i =1;i<=20;i++)
{
	System.out.println(i);
}


//switch
if(salary < 50000)
{
	System.out.println("no need to pay income tax");
}
else if (salary > 50000 && salary< 70000)
{
	System.out.println("I am in slab one");
}
else if (salary <= 50000)
{
	System.out.println("No need to pay tax");
}
else if(salary > 70000 && salary <100000)
{
	System.out.println("I am in slab2");
}
else 
{
		System.out.println("i am in the final slab");
}		
if (k>=5)
{
	System.out.println("k is greater than five");
}
else
{System.out.println("k is less than five");
}
 
if (name)
{
	System.out.println("Boolean values is true");
}
else
{
	System.out.println("Boolean value is false");
}
if (x>=2)
{
	System.out.println("x is greater than two");
	
}
else
{
	System.out.println("x is less than two");
}
}
public int sum(int x, int y)
{
	int z = x +y;
	return z;
	
}
public int divide(int x, int y)
{
	int z=0;
try
{	 z = x /y;
	
} catch (Exception e)
{
	System.out.println("Exception in Division");
}
return z;
}
}