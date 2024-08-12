package Generics;

interface abc<T> //generic type of interface
{
	void call(T t);
	
}

class demo<T> implements abc<T> //this is the right way of generic interface implementation
{
	public void call(T t)
	{
		System.out.println(t);
	}
}

public class EX2_withInterface
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.call(90);
		d.call("hello generics");
		d.call(45.90);
	}

}
