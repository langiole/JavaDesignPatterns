package decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);
		
		System.out.println("Adding Mozzarella");
	}

	@Override
	public String getDesciption() {
		return pizza.getDesciption() + ", Mozzarella";
	}
	
	@Override
	public double getCost() {
		return pizza.getCost() + .50;
	}
	
}
