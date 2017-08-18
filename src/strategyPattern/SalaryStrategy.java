package strategyPattern;

public interface SalaryStrategy {
	
	double basicSalary(double employeeExpenses);
	
	double bonus(double bonus);
	
	String getPosition();

}
