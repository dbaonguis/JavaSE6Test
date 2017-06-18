package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	
	public static void main(String[] args) {
		Employee employee = null;
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
		    employee = (Employee) in.readObject();
		    in.close();
		    fileIn.close();
		} catch(IOException ex) {
			ex.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("Employee class not found");
			e.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
	    System.out.println("Name: " + employee.getName());
	    System.out.println("Address: " + employee.getAddress());
	    System.out.println("SSN: " + employee.getSsn());
	    System.out.println("Number: " + employee.getNumber());
	    
	    
	    System.out.println("---------------");
	    
	    /* For Subclass */
	    
		EmployeeSubclass employeeSubclass = null;
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/employee-subclass.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			employeeSubclass = (EmployeeSubclass) in.readObject();
		    in.close();
		    fileIn.close();
		} catch(IOException ex) {
			ex.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("EmployeeSubclass class not found");
			e.printStackTrace();
			return;
		}
		System.out.println("Deserialized EmployeeSubclass...");
	    System.out.println("Name: " + employeeSubclass.getName());
	    System.out.println("Address: " + employeeSubclass.getAddress());
	    System.out.println("SSN: " + employeeSubclass.getSsn());
	    System.out.println("Number: " + employeeSubclass.getNumber());
	}
}