package command;

import java.util.List;

public class TurnItAllOff implements Command {
	
	List<ElectronicDevice> devices;
	
	public TurnItAllOff(List<ElectronicDevice> devices) {
		this.devices = devices;
	}

	@Override
	public void execute() {
		for (ElectronicDevice d : devices) {
			d.off();
		}
	}
	
	@Override
	public void undo() {
		for (ElectronicDevice d : devices) {
			d.on();
		}
	}
	
}
