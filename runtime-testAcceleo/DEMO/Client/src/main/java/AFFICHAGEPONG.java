
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


public class AFFICHAGEPONG extends Action {

	@Override
	public void execute(FSM fsm, Event e) {
		
		// Start of user code for AffichagePong contents
		fsm.LOGGER.info("Received Pong with id : " + e.getData("id"));

 		// End of user code
		
	}

}
