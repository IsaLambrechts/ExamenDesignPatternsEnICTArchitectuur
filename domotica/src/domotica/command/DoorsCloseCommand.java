package domotica.command;

import domotica.model.*;

public class DoorsCloseCommand implements Command {

	DomoticaObject object;
	
	public DoorsCloseCommand(DomoticaObject object) {
		this.object = object;
	}
	
	@Override
	public void execute() {
		try {
			object.setDoorsClosed();
		} 
		catch (ElectricityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
