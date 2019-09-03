package decorator;

public class PlainPizza implements Pizza {
	
	public PlainPizza() {
		System.out.println("Adding Dough");
	}
	
	@Override
	public String getDesciption() {
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		return 4;
	}

}
