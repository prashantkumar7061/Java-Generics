package Generics;

interface add
{
	void show(); //no parameter
}

interface kk
{
	void hello(int x);//single parameter
}

interface dd
{
	void demo(int x,int y);//multiple parameter
}
//This is the example of void type functional Interface method

public class EX4_lambda2
{
public static void main(String args[])
{
	add ld=()->{ //no parameter
		System.out.println("from show method");
	};
	ld.show();
	
	kk k=(p)-> //single parameter
	{
		System.out.println(p+p);
	};
	k.hello(15);
	
	dd d=(a,b)-> //multiple parameter
	{
		System.out.println(a+b);
	};
	d.demo(12,90);
	System.out.println("************************");
	
	
	
}
}
