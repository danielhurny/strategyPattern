package strategyPattern;

public class ParttimerStrategy implements SalaryStrategy {
	
	private final String POSITION = "PartTIMER";

	@Override
	public double basicSalary(double employeeExpenses) {
		// TODO Auto-generated method stub
		return employeeExpenses*0.45;
	}

	@Override
	public double bonus(double bonus) {
		
		return bonus*0.20;
	}

	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return POSITION;
	}

}
