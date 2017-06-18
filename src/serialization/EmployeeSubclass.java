package serialization;



public class EmployeeSubclass extends Employee {

	private transient int  number;
	private transient String name;
	private transient String address;
	
	@Override
	public int getNumber() {
		return this.number;
	}
	
	@Override
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getAddress() {
		return this.address;
	}
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}