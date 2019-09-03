package decorator;

public abstract class ToppingDecorator implements Pizza {
	protected Pizza pizza;
	
	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return pizza.getDesciption();
	}
	
	public double getCost() {
		return pizza.getCost();
	}
}
