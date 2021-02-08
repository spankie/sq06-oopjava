package oopjava;

import oopjava.abs.Employee;
import oopjava.abs.Salary;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Salary s = new Salary("Toluwase", "Decagon Uno", 3, 3600.00);
        Salary e = new Salary("Pereira", "Decagon Uno", 2, 2400.00);
        // System.out.println("Call mailCheck using Salary reference --");
        // s.mailCheck();
        // System.out.println("\n Call mailCheck using Employee reference--");
        // e.mailCheck();
        System.out.println("first salary: "+ s.getSalary());
        System.out.println("second salary: " + e.getSalary());
    }
}
