package Generics;

import java.util.function.Function; //note the package name is function
//this is the treditional way of using Functional Interface

class jk implements Function<String,Integer>
{
	public Integer apply(String msg)//returns Integer apply is the abstract method of function internal
	{
		return msg.length();//return the length of string passed
	}
}

public class lambda2 
{
public static void main(String args[])
{
	jk j=new jk();
	System.out.println(j.apply("hello java"));//calling interface method i,e, returns integer as definer
	Function<String,String> data=(msg)->msg.toUpperCase();
	System.out.println(data.apply("hello lambda"));
	Function<String,String> mydata=(msg)->
	{
		return msg.concat("Ranchi city");//this is with return statement output
	};
	System.out.println(mydata.apply("hello lambda method"));//method must be call.
}
}
