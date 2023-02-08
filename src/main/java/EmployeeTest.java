
import virk.manpreet.employee.Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John" , "Smith", 100000.00);
        Employee emp2 = new Employee("Alexa", "Baker", 90000.00);
        
        
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getSalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getSalary() );
        System.out.println("After 10 percent Raise");
       
        System.out.printf( "Yearly salary of %s %s:%.2f\n", emp1.getFirstName(), emp1.getLastName(),emp1.getRaisedSalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getRaisedSalary());
        
        System.out.print("Enter the amount of numbers you are going to input");
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            System.out.print("Enter Integer" + (i+1) +":");
            int num = scanner.nextInt();
            min = num;
        }
        
        System.out.println("The minimum of the set of numbers is:"+min);
        
        
        
    }
}
