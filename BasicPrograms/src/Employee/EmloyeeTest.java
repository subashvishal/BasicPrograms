package Employee;

public class EmloyeeTest {

	public static void main(String[] args) {
		Employe emp1 = new Employe("Subash Vishal" );
        Employe emp2 = new Employe("Dini Fz");
        Employe emp3 = new Employe("Shanthosh" );
        Employe emp4 = new Employe("Roshan Kumar");

    	System.out.println("Employee no. 1 : " );
        emp1.empAge(22);
        emp1.empDesignation("Software Engineer");
        emp1.empSalary(45000);
        emp1.printDetails();
        
        System.out.println("Employee no. 2 : " );
        emp2.empAge(21);
        emp2.empDesignation("Software Developer");
        emp2.empSalary(55000);
        emp2.printDetails();
        
        System.out.println("Employee no. 3 : " );
        emp3.empAge(12);
        emp3.empDesignation("6th Grade");
        emp3.empSalary(80000);
        emp3.printDetails();
        
        System.out.println("Employee no. 4 : " );
        emp4.empAge(22);
        emp4.empDesignation("Software Engineer");
        emp4.empSalary(35000);
        emp4.printDetails();
	
        } } 

