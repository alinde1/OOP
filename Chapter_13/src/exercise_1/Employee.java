/**
 * An EmployeeModel class. Add a notification mechanism to this class.
 * @author  Tony Sintes STYOOP
 * @version 2.0 
 */
public abstract class Employee {

    private String first_name;
    private String last_name;
    private double wage;
    
    public Employee(String first_name,String last_name,double wage) {
        this.first_name = first_name;
        this.last_name  = last_name;
        this.wage = wage;
    }

    public double getWage() {
          return wage;
    }

    public void setWage( double wage ) {
        this.wage = wage;
    }
    
    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public abstract double calculatePay();
      
    public abstract double calculateBonus();
    
    public void printPaycheck() {
        String full_name = last_name + ", " + first_name;
        System.out.println( "Pay: " + full_name + " $" + calculatePay() );
    }
        
}
