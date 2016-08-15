package payment;

public class EconomyCar extends CalculatePayment{
	
	public EconomyCar(double miles, int no_of_memb) {
		super(miles, no_of_memb);
	}
	
	public double type_percent = 1.2;
	
	@Override
	public void cost_for_distance() 
	{
			tot_cost = super.miles * super.cost_per_mile * type_percent;
			System.out.println("Total Cost for distance covered: " + tot_cost);
			ind_cost = tot_cost / super.no_of_memb;
			System.out.println("Cost per person for distance covered: " + ind_cost);
	}
	
}
