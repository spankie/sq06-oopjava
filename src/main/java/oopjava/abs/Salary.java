package oopjava.abs;

public class Salary extends Employee {
  private static double salary;   // Annual salary
  
  public Salary(String name, String address, int number, double salary) {
     super(name, address, number);
     setSalary(salary);
  }
  
  public void mailCheck() {
     System.out.println("Within mailCheck of Salary class ");
     System.out.println("Mailing check to " + getName() + " with salary " + salary);
  }

  public double getSalary() {
     return salary;
  }
  
  /// TODO: learn about static methods
  public void setSalary(double newSalary) {
     if(newSalary >= 0.0) {
        salary = newSalary;
     }
  }
  
  public double computePay() {
     System.out.println("Computing salary pay for " + getName());
     Mailer m = new Sendgrid();
     m.sendMail("email", "here is your salary", "your salary for the month of feb is "+  this.getSalary());
     return salary/52;
  }
}