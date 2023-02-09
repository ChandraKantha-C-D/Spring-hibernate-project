package Empolyee_dto;

public class Employee {
	String name;
	int age;
	String address;
	 



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public void print() {
		System.out.println("Employee name : "+name);
		System.out.println("Employee name : "+age);
		System.out.println("Employee name : "+address);
	}

}
