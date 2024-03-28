package practiceWithJava;

class Employee{
	
	int employeeId;
	String employeeName;
	double salary;
	
	int employeeIdInfo(){
		
				return employeeId;
			}
	
	String employeeNameInfo() {
		
		return employeeName;
	}
	
	double employeeSalaryInfo() {
		
		return salary;
	}
	
	}

public class FuctionsPractice2 {

	public static void main(String[] args) {
		
     Employee e1 = new Employee();
     
     e1.employeeId = 101;
     e1.employeeName = "Suresh";
     e1.salary = 60000;
     
     		System.out.println(">>>>>>>>>>>>>>>1st employee");

         System.out.println("Employee ID Number = " + e1.employeeIdInfo());
         System.out.println("Employee name = " + e1.employeeNameInfo());
         System.out.println("Employee salary = " + e1.employeeSalaryInfo());
         
         Employee e2 = new Employee();
         
         e2.employeeId = 102;
         e2.employeeName = "Ramesh";
         e2.salary = 50000;
         
         System.out.println(">>>>>>>>>>>>>>>2nd employee");
         System.out.println("Employee ID Number = " + e2.employeeIdInfo());
         System.out.println("Employee name = " + e2.employeeNameInfo());
         System.out.println("Employee salary = " + e2.employeeSalaryInfo());
         

		}
	}
		
		
		
	
	

	
	

