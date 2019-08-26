package observer;
import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int index = observers.indexOf(deleteObserver);
		if (observers.remove(deleteObserver)) {
			System.out.println("Observer " + (index+1) + " deleted");
		}
		else {
			System.out.println("Observer does not exist");
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	public void setIBMPrice(double newPrice) {
		this.ibmPrice = newPrice;
		notifyObserver();
	}
	
	public void setAAPLPrice(double newPrice) {
		this.aaplPrice = newPrice;
		notifyObserver();
	}
	
	public void setGOOGPrice(double newPrice) {
		this.googPrice = newPrice;
		notifyObserver();
	}
	
}
