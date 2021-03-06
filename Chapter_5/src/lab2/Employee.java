/**
 * Employee is an abstract base class. All employees have a first name, last name,
 * and a wage. Each employee should be able to calculate its wage. However,
 * the actual mechanism to calculate the wage depends on the employee type. So,
 * each subtype must define how to calculate its pay.
 * @author  Tony Sintes STYOOP
 * @version 1.0 
 */
public abstract class Employee {

      private String first_name;
      private String last_name;
      private double wage;

      public Employee( String first_name, String last_name, double wage ) {
          this.first_name = first_name;
          this.last_name  = last_name;
          this.wage = wage;
      }

      public double getWage() {
            return wage;
      }

      public String getFirstName() {
          return first_name;
      }

      public String getLastName() {
          return last_name;
      }

      public abstract double calculatePay();
      
      public String printPaycheck() {
          String full_name = last_name + ", " + first_name;
          return ( "Pay: " + full_name + " $" + calculatePay() );
      }
}
