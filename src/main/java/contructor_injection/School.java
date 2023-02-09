package contructor_injection;

public class School {
	private String name;
	private double fee;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public School(String name, double fee, String address) {
		
		this.name = name;
		this.fee = fee;
		this.address = address;
	}
	
	

}
