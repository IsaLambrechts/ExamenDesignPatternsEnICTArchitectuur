package domotica.command;

import domotica.model.DomoticaObject;

public class RemoteControl {
	
	public RemoteControl(){}
	
	public void setAllDoorsOpen(DomoticaObject object) {
		DoorsOpenCommand openDoorCommand = new DoorsOpenCommand(object);
		openDoorCommand.execute();
	}
	
	public void setAllDoorsClosed(DomoticaObject object) {
		DoorsCloseCommand closeDoorCommand = new DoorsCloseCommand(object);
		closeDoorCommand.execute();
	}

}
