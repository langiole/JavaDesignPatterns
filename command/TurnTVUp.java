package command;

public class TurnTVUp implements Command {
	
	ElectronicDevice device;
	
	public TurnTVUp(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();
	}
	
	@Override
	public void undo() {
		device.volumeDown();
	}
}
