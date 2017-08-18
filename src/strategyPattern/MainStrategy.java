package strategyPattern;

public class MainStrategy {

	public static void main(String[] args) {
		SalaryContext context = new SalaryContext();
		
		context.setStrategy(new ContractorStrategy());
		context.execute(1000, 1000);
		
		context.setStrategy(new EmployeeStrategy());
		context.execute(1000, 1000);

		context.setStrategy(new ParttimerStrategy());
		context.execute(1000, 1000);
		
		// TODO Auto-generated method stub

	}

}
