package prototype;

public class Sheep implements Animal {
	
	public Sheep() {
		System.out.println("Sheep is Made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is Being Made");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	// returns a String representation of the object
	public String toString() {
		return "Dolly is my Hero, Baaaa";
	}
	
}
