package Generics;


interface hellme
{
	void call(int y);
}

class cross implements hellme
{
	public void call(int y)
	{
		System.out.println("from call "+y);
	}
}
public class Ex3_Lambda1 
{
	public static void main(String args[])
	{
		//cross j=new cross();
		//j.call();
		
		hellme h=(input)->System.out.println("welcome "+input);
		h.call(120);
		
	}

}
