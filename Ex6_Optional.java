package Generics;

import java.util.Optional;

//Optional is a container object which may or may not contain a non-null value.
//tom use this class. If a velue is present, is present()will return true and get

class Employee
{
	int id;
	String name;
	String email;
	String city;
	public Employee(int id, String name, String email, String city) {
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
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + "]";
	}
	
	
}
public class Ex6_Optional
{
	public static void main(String args[])
	{
		Employee e=new Employee(12,null,"kk@gmail.com",null);
		Optional<Employee> ee=Optional.of(e);
		
		if(ee.isPresent())
		{
			System.out.println(ee.get().getName());
		}
		else
		{
			System.out.println("Data missing");
		}
		System.out.println(ee);
		System.out.println(ee.isPresent());
		System.out.println(ee.get());//getting the object of Employee only cheak output
		System.out.println(ee.get().getName());
	}

}
