
package Client;

import fsm.*;
import network.NetworkMessageParser;

import javafx.util.Pair;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.UUID;

import asn1.messageping.*;

public class ClientNetworkMessageParser extends NetworkMessageParser {
	
	boolean alreadyParsed;

	public ClientNetworkMessageParser(Pair<UUID, DataInputStream> origin, FSMClient fsm) {
		super(origin, fsm);
		alreadyParsed = false;
	}

	@Override
	public void parse(String currentState) {
			if(!alreadyParsed) {
		switch (currentState) {
		case "Attente":
			MessagePing m = new MessagePing();
			try {
				m.decode(input);

				Event e = new Event();
				e.name = "pong";
				e.origin = originId;
				e.setData("id", m.getId().intValue());
				fsm.queueEvent(e);
				alreadyParsed = true;
			} catch (EOFException e) {

			} catch (IOException e) {
				fsm.LOGGER.warning("Cannot read from InputStream of client " + originId);
				running = false;
				e.printStackTrace();
			}

			break;
		default:
			break;

		}
			}
	}

}

