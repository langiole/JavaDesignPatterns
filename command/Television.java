package command;

public class Television implements ElectronicDevice {
	
	private int volume = 0;

	@Override
	public void on() {
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		System.out.println("TV is off");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV volume is at " + ++volume);	
	}

	@Override
	public void volumeDown() {
		System.out.println("TV volume is at " + --volume);
		
	}
}
