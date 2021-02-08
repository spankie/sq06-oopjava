package oopjava;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import oopjava.abs.Employee;
import oopjava.abs.Salary;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCallChildMethod()
    {
        Salary e = new Salary("Spankie", "Northern Foreshore estate", 2, 2000);
        Double sal = (double) 2500;
        e.setSalary(sal);
        // assertEquals(2000/52, e.getSalary(), 3);
        assertEquals(sal, e.getSalary(), 1);
        e.setSalary(-2);
        assertEquals(sal, e.getSalary(), 1);
    }

    @Test
    public void shouldCallParentMethod()
    {
        Salary s = new Salary("Toluwase", "Decagon Uno", 3, 3600.00);
        assertEquals(3600.00/52, s.computePay(), 1);
    }
}
