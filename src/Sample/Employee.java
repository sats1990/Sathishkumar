package Sample;

import Sample1.Company;
import Sample2.Project;
import Sample3.Client;

public class Employee {
	public void employeeNmae() {
		System.out.println("Sathish");
	}
	public void employeeId() {
		System.out.println("51625849");
	}
	public static void main(String[] args) {
		Employee details = new Employee();
		details.employeeNmae();
		details.employeeId();
		Company name = new Company();
		name.companyName();
		Project name1 = new Project();
		name1.projectName();
		Client name2 = new Client();
		name2.clientName();
		
	}
}
	
