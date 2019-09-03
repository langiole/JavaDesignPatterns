package command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args) {
		ElectronicDevice device = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(device);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		// ------
		
		TurnTVOff offCommand = new TurnTVOff(device);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		
		// ------
		
		TurnTVUp volUpCommand = new TurnTVUp(device);
		
		onPressed = new DeviceButton(volUpCommand);
		
		onPressed.press();
		onPressed.press();
		
		// -----
		
		Television tv = new Television();
		
		Radio radio = new Radio();
		
		List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
		
		devices.add(tv);
		devices.add(radio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(devices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();
		
		turnThemOff.pressUndo();
		
		

	}

}
