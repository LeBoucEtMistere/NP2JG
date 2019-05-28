
package Client;

import java.io.IOException;

import org.openmuc.jasn1.ber.ReverseByteArrayOutputStream;

import fsm.Action;
import fsm.Event;
import fsm.FSM;
import fsm.FSMClient;

// Start of user code imports

 // your imports

// End of user code


public class TIMEOUTACTION extends Action {

	@Override
	public void execute(FSM fsm, Event e) {
		
		// Start of user code for timeoutAction contents
		Event ev = new Event();
		ev.name = "timeout";
		fsm.launchTimer(3*1000, ev);


 		// End of user code
		
	}

}
