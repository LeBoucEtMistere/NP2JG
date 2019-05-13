
package PongServer

import java.io.IOException;

import org.openmuc.jasn1.ber.ReverseByteArrayOutputStream;

import fsm.Action;
import fsm.Event;
import fsm.FSM;
import fsm.FSMServer;


public class TIMEOUTACTION extends Action {

	@Override
	public void execute(FSM fsm, Event e) {

		var dos = ((FSMServer)fsm).getNetworkServer().getOutputStreamByClient(e.origin);

		// Start of user code for TimeoutAction contents
 		// TODO : Action contents
 		// End of user code
		
	}

}
