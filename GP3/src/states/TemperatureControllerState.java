package states;

import events.ACEvent;
import events.AllOffEvent;
import events.FanEvent;
import events.HeaterEvent;
import events.SetCurrentTempEvent;
import events.SetDesireTempEvent;
import events.SetOutsideTempEvent;
import events.TimerRanOutEvent;
import events.TimerTickedEvent;

/**
 *
 * @author Brahma Dathan and Sarnath Ramnath
 * @Copyright (c) 2010

 * Redistribution and use with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - the use is for academic purpose only
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   - Neither the name of Brahma Dathan or Sarnath Ramnath
 *     may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * The authors do not make any claims regarding the correctness of the code in this module
 * and are not responsible for any loss or damage resulting from its use.
 */
/**
 * Super class for all states
 *
 *
 */
public abstract class TemperatureControllerState {

	/**
	 * Initializes the state
	 */
	public abstract void enter();

	/**
	 * Performs any necessary clean up while leaving the state
	 */
	public abstract void leave();

	/**
	 * Specifies the actions to be taken when the Cook button is pressed.
	 */
	public void handleEvent(ACEvent event) {
	}

	/**
	 * Process AllOfEvent request.
	 */
	public void handleEvent(AllOffEvent event) {
	}

	/**
	 * Process FanEvent request.
	 */
	public void handleEvent(FanEvent event) {
	}

	/**
	 * Process HeaterEvent request.
	 */
	public void handleEvent(HeaterEvent event) {
	}

	/**
	 * Process timer ran out event.
	 */
	public void handleEvent(TimerRanOutEvent event) {
	}

	/**
	 * Process timer ticked event.
	 */
	public void handleEvent(TimerTickedEvent event) {
	}

	/**
	 * Process desired temperature change event.
	 */
	public void handleEvent(SetDesireTempEvent event) {
	}

	/**
	 * Process outside temperature change event.
	 */
	public void handleEvent(SetOutsideTempEvent event) {
	}

	/**
	 * Process current temperature change event.
	 */
	public void handleEvent(SetCurrentTempEvent event) {
	}
}