package domotica.command;

import domotica.model.DomoticaObject;

public class RemoteControl {
	
	public RemoteControl(){}
	
	public void setAllDoorsOpen(DomoticaObject object) {
		DoorsOpenCommand openCmd = new DoorsOpenCommand(object);
		openCmd.execute();
		//object.update();
	}
	
	public void setAllDoorsClosed(DomoticaObject object) {
		DoorsCloseCommand closeCmd = new DoorsCloseCommand(object);
		closeCmd.execute();
		//object.update();
	}

}
