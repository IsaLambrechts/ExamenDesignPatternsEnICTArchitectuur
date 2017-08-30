package domotica.model;

import java.io.Serializable;
import java.util.Observable;

@SuppressWarnings("serial")
public abstract class DomoticaObject extends Observable implements Serializable {

	private int aircoTemperature;
	private float lightLevel;
	private boolean rollerShutterDown;
	private boolean doorClosed;
	private String id;

	public String getId() {	return id; }

	public String toString() {
		return getId();
	}

	DomoticaObject(String id) {
		this.id = id;
	}

	public boolean isDoorClosed() 			{	return doorClosed; }

	public void setDoorsClosed() throws ElectricityException {
		this.doorClosed = true;
		System.out.println("Closing doors...");
	}
	
	public void setDoorsOpened() throws ElectricityException {
		this.doorClosed = false;
		System.out.println("Opening doors...");
	}
	
	public void openRoom() {
		try {
			setDoorsOpened();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeRoom() {
		try {
			setDoorsClosed();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		setChanged();
		notifyObservers();
	}
}
