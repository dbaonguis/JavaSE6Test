package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Donato Baonguis");
		employee.setAddress("Pennsylvania");
		employee.setSsn(1234567890);
		employee.setNumber(123);
		
		/* Subclass test*/
		EmployeeSubclass employeeSubclass = new EmployeeSubclass();
		employeeSubclass.setName("Donato Baonguis-Subclass");
		employeeSubclass.setAddress("Pennsylvania-Subclass");
		employeeSubclass.setSsn(1234567890);
		employeeSubclass.setNumber(123);
		
		      
		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
		    out.writeObject(employee);
		    out.close();
		    fileOut.close();
		    System.out.println("Serialized data is saved in /tmp/employee.ser");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		/* For subclass */
		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/employee-subclass.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
		    out.writeObject(employeeSubclass);
		    out.close();
		    fileOut.close();
		    System.out.println("Serialized data is saved in /tmp/employee-subclass.ser");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}