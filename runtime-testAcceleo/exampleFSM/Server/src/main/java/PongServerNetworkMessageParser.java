
package PongServer;

import fsm.*;
import network.NetworkMessageParser;

import javafx.util.Pair;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.UUID;

import asn1.messageping.*;

public class PongServerNetworkMessageParser extends NetworkMessageParser {
	

	public PongServerNetworkMessageParser(Pair<UUID, DataInputStream> origin, FSMServer fsm) {
		super(origin, fsm);
	}

	@Override
	public void parse(String currentState) {
		switch (currentState) {
		case "Attente":
			MessagePing m = new MessagePing();
			try {
				m.decode(input);

				Event e = new Event();
				e.name = "ping";
				e.origin = originId;
				e.setData("id", m.getId().intValue());
				fsm.queueEvent(e);
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

