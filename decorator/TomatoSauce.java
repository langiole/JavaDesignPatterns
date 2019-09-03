package decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
		
		System.out.println("Adding Tomato Sauce");
	}

	@Override
	public String getDesciption() {
		return pizza.getDesciption() + ", Tomato Sauce";
	}
	
	@Override
	public double getCost() {
		return pizza.getCost() + .35;
	}
	
}
