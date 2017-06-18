package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4784019640343813432L;

	private int number;
	private String name;
	private String address;
	private transient int ssn;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSsn() {System.out.println("Mailing a check to " + name + " " + address);
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}

}