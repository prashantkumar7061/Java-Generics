package Generics;
// Any type of data can be handled

class A<T>
{
	void call(T t)
	{
		System.out.println(t);
	}
}
public class EX1_A 
{
public static void main(String args[])
{
	A a=new A();
	a.call("hello");
	a.call("Ranchi");
	a.call(90);
	a.call(90.2341);
}
}
