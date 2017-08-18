package strategyPattern;

public class EmployeeStrategy implements SalaryStrategy {
	
	private final String POSITION = "Employee";

@Override
	public double basicSalary(double employeeExpenses) {
		return employeeExpenses*0.64;
	}

    @Override
	public double bonus(double bonus) {
		
		return bonus*0.75;
	}

	@Override
	public String getPosition() {
		
		return POSITION;
	}

}
