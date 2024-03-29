package observer;

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Observer " + this.observerID);
		
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();

	}

	public void printThePrices() {
		System.out.printf("%d\nIBM: %.2f\nAAPL: %.2f\nGOOG: %.2f\n\n", observerID, ibmPrice, aaplPrice, googPrice);
	}
}
