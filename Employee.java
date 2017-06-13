package abstractClasses;
import java.util.*;
import java.util.GregorianCalendar;
public class Employee extends Person
 {
	private double salary;
	 private Date hireDay;
	
	 public Employee(String n, double s, int year, int month, int day)
	 {
	 super(n);
	 salary = s;
	 	
	 GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
	 hireDay = calendar.getTime();
	 }
	 public String getDescription()
	  {
	  return String.format("an employee with a salary of $%.2f",
	 salary);
	  }
	 
	 public double getSalary()
	 {
	 return salary;
 }
	
	 public Date getHireDay()
	 {
	 return hireDay;
	 }
	 
	
	public void raiseSalary(double byPercent)
	 {
	 double raise = salary * byPercent / 100;
	 salary += raise;
	 }
}
