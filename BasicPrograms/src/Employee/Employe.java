package Employee;

public class Employe {
	
	String name;
	String designation;
	int age;
	double salary;
	
public Employe(String name) {
	this.name = name;
}
	public void empAge(int empAge) {
		age=empAge; 
	}
	
	public void empDesignation(String empDesignation) {
		designation=empDesignation;
  }
	
	public void empSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printDetails() {
		System.out.println("Name is " + name);
		System.out.println("Designation is "+ designation);
		System.out.println("Age is "+ age);
		System.out.println("Salary of "+ name + " is " + salary + " \n ");
	}
	
 }