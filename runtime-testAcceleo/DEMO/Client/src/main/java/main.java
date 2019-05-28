
package Client;

import java.util.logging.Level;

import fsm.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

import Client.ENVOIEPING;
import Client.AFFICHAGEPONG;
import fsm.DisconnectFromServerAction;
import Client.TIMEOUTACTION;

public class main {
	
	public static void main(String[] args) {

		InetAddress host = null;
		try {
			// TODO : Insert the address to the host here :
			host = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		var fsm = new FSMClient("Client", (dis, f) -> new ClientNetworkMessageParser(dis, f), host, 50300, "clientpw");
		fsm.LOGGER.setLevel(Level.INFO);

		State state_attente = new State("Attente");
		state_attente.onEnteredAction(new TIMEOUTACTION());
		State state_attentepong = new State("AttentePong");
		State state_fin = new State("Fin");

		Transition trans_connexionrecue = new Transition("connexionRecue");
		trans_connexionrecue.setSource(state_attente);
		trans_connexionrecue.setTarget(state_attentepong);
		trans_connexionrecue.registerEvent("newConnection");
		trans_connexionrecue.registerAction(new ENVOIEPING());
		
		trans_connexionrecue.registerGuard(new TJRSVRAI());
		
		Transition trans_timeoutr = new Transition("timeoutr");
		trans_timeoutr.setSource(state_attente);
		trans_timeoutr.setTarget(state_fin);
		trans_timeoutr.registerEvent("timeout");
		
		Transition trans_pongrecu = new Transition("pongRecu");
		trans_pongrecu.setSource(state_attentepong);
		trans_pongrecu.setTarget(state_fin);
		trans_pongrecu.registerEvent("pongRecu");
		trans_pongrecu.registerAction(new AFFICHAGEPONG());
		
		trans_pongrecu.registerAction(new DisconnectFromServerAction());
		
		

		fsm.addState(state_attente);
		fsm.addState(state_attentepong);
		fsm.addState(state_fin);
		
		fsm.setInitialState(state_attente);
		fsm.setFinalState(state_fin);
		
		fsm.start();
		
	}
}


