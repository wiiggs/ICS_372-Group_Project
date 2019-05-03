package states;

import events.AllOffEvent;
import events.FanEvent;
import events.HeaterEvent;
import events.IdealTempEvent;
import thermometer.Notifiable;
import thermometer.Thermometer;

public class ACIdleState extends TemperatureControllerState implements Notifiable {
	private Thermometer thermometer;

	private static ACIdleState instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private ACIdleState() {
		instance = this;
	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the object
	 */
	public static ACIdleState instance() {
		if (instance == null) {
			instance = new ACIdleState();
		}
		return instance;
	}

	@Override
	public void handleEvent(AllOffEvent event) {
		TemperatureControllerContext.instance().changeState(AllOffState.instance());
	}

	@Override
	public void handleEvent(FanEvent event) {
		TemperatureControllerContext.instance().changeState(FanIdleState.instance());
	}

	@Override
	public void handleEvent(HeaterEvent event) {
		TemperatureControllerContext.instance().changeState(HeaterIdleState.instance());
	}

	public void handleEvent(IdealTempEvent event) {
		TemperatureControllerContext.instance().showCurrentTemp(thermometer.getTempValue());
	}

	@Override
	public void enter() {
		TemperatureControllerContext.instance().showAcOn();

	}

	@Override
	public void leave() {

	}

}