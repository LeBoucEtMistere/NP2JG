
package PongServer;

import java.io.IOException;

import org.openmuc.jasn1.ber.ReverseByteArrayOutputStream;

import fsm.Action;
import fsm.Event;
import fsm.FSM;
import fsm.FSMServer;

// Start of user code imports

 // your imports

// End of user code


public class TIMEOUTACTION extends Action {

	@Override
	public void execute(FSM fsm, Event e) {
		
		// Start of user code for TimeoutAction contents

		Event ev = new Event();
		ev.name = "timeoutConnection";
		fsm.launchTimer(10*1000, ev);

 		// End of user code
		
	}

}
