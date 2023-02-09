package contructor_injection;

public class Student {
	
	private String name;
	private int phone;
	private String course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(String name, int phone, String course) {
	
		this.name = name;
		this.phone = phone;
		this.course = course;
	}
	
	
	

}
