
package PongServer;

import java.io.IOException;

import org.openmuc.jasn1.ber.ReverseByteArrayOutputStream;

import fsm.Action;
import fsm.Event;
import fsm.FSM;
import fsm.FSMServer;

// Start of user code imports

import asn1.messageping.*;
import org.openmuc.jasn1.ber.types.BerInteger;

// End of user code


public class PONGACTION2 extends Action {

	@Override
	public void execute(FSM fsm, Event e) {
		
		// Start of user code for PongAction2 contents

		fsm.LOGGER.info("Sending Pong with id : " + e.getData("id"));
		
		var dos = ((FSMServer)fsm).getNetworkServer().getOutputStreamByClient(e.origin);
		
		MessagePing r = new MessagePing();
		r.setType(new MESSAGETYPE(1));
		r.setId(new BerInteger(2 * (int)e.getData("id")));
		
		// Strangely ASN1 require a reversing of bytes to be correctly decoded ...
		ReverseByteArrayOutputStream rba = new ReverseByteArrayOutputStream(1000);

		try {
			r.encode(rba);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			dos.write(rba.getArray());
		} catch (IOException exception) {
			exception.printStackTrace();
		}

 		// End of user code
		
	}

}
