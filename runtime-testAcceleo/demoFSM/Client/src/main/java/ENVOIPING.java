
package Client;

import java.io.IOException;

import org.openmuc.jasn1.ber.ReverseByteArrayOutputStream;

import fsm.Action;
import fsm.Event;
import fsm.FSM;
import fsm.FSMClient;

// Start of user code imports

import java.util.concurrent.ThreadLocalRandom;
import org.openmuc.jasn1.ber.types.BerInteger;
import asn1.messageping.*;

// End of user code


public class ENVOIPING extends Action {

	@Override
	public void execute(FSM fsm, Event e) {
		
		// Start of user code for envoiPing contents
		var dos = ((FSMClient)fsm).getNetworkClient().getOutputStream();
 		
		int randomId = ThreadLocalRandom.current().nextInt(0, 10000 + 1);
		
		fsm.LOGGER.info("Sending Ping with id : " + randomId);


		MessagePing r = new MessagePing();
		r.setType(new MESSAGETYPE(0));
		r.setId(new BerInteger(randomId));

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
