/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package virk.manpreet.employee;

public class Employee {
    private String FirstName;
    private String LastName;
    private double Salary;
    public Employee(String fname, String lname, double sal){
        FirstName = fname;
        LastName = lname;
        Salary = sal;
        if (sal >= 0.0) {
        } else {
            Salary = 0.0;
        }
    }
     public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
     }
     public String getFirstName() {
        return FirstName;
    }
     public void setLastName(String LastName) {
        this.LastName = LastName;
    }
      public String getLastName() {
        return LastName;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
     public double getSalary() {
        return Salary;
        
    }
public double getRaisedSalary(){
   double raisedSalary = Salary + (Salary*.10);
   return raisedSalary;
}
}
