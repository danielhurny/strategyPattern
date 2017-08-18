package strategyPattern;

public class SalaryContext {

	SalaryStrategy strategy;

	public SalaryStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(SalaryStrategy strategy) {
		this.strategy = strategy;
	}
	 
	public void execute (double salary, double bonus) {
		System.out.println("Your total salary on position "+strategy.getPosition()+" is : "+(strategy.basicSalary(salary)+strategy.bonus(bonus)));
	}
	
}
