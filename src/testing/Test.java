package testing;
import java.util.Random;

import mypractice.GoodMorning;

public class Test {
	public static void main(String args[])
	{
		int k =8;
		int n =4;
		GoodMorning gmObj = new GoodMorning();
	int r =	gmObj.sum(k, n);
	//	System.out.println(r);
	int s = gmObj.divide(k, n);
//	System.out.println(s);
	Random ranObj = new Random();
	int z =ranObj.nextInt(10000);
//	System.out.println(z);

	for( int i =1;i<=20;i++)
	{
		System.out.println(i);
		
	}
	for (int i =2;i<=20;i+=2)
	{
		System.out.println(i);
	}
	}

	}
//switch
// while loop
// do while loop
