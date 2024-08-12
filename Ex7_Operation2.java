package Generics;

import java.util.Optional;

class Employee2
{
	int id;
	String name;
	String email;
	String city;
	public Employee2(int id, String name, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + "]";
	}
	
}

public class Ex7_Operation2
{
	public static void main (String args[])
	{
		String msg=null;
		Optional<String> op=Optional.ofNullable(msg); //will not throws exception.
		System.out.println(op.isPresent());
		System.out.println(op.orElse("no velue found"));
		System.out.println(op.orElseGet(()->"no velue is present here"));
		System.out.println(op.orElseThrow(()->new IllegalArgumentException("illegsl argument exception")));
		
	}

}
