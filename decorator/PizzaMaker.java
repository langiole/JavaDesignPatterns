package decorator;

public class PizzaMaker {
	public static void main(String[] args) {
		Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients: " + pizza.getDesciption());
		System.out.println("Cost: " + pizza.getCost());

	}
}
