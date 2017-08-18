package strategyPattern;

public class ContractorStrategy implements SalaryStrategy {

	private final String POSITION = "Contractor";
	
	@Override
	public double basicSalary(double employeeExpenses) {
		
		return employeeExpenses*0.846;
	}

	@Override
	public double bonus(double bonus) {
		
		return bonus*0.47;
	}

	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return POSITION;
	}

}
