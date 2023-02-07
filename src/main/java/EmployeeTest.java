
import virk.manpreet.employee.Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John" , "Smith", 100000.00);
        Employee emp2 = new Employee("Alexa", "Baker", 90000.00);
        
        
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getSalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getSalary() );
        System.out.println("After 10 percent Raise");
       
        System.out.printf( "Yearly salary of %s %s:%.2f\n", emp1.getFirstName(), emp1.getLastName(),emp1.getRaisedSalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getRaisedSalary());

		
        
    }
}
