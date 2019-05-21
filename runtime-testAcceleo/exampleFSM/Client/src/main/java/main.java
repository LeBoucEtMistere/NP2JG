
package Client;

import java.util.logging.Level;

import fsm.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

import Client.PINGACTION;
import Client.PONGACTION;
import fsm.DisconnectFromServerAction;

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

		State state_attenteconnexion = new State("AttenteConnexion");
		State state_attente = new State("Attente");
		State state_fin = new State("Fin");

		Transition trans_connexionrecue = new Transition("ConnexionRecue");
		trans_connexionrecue.setSource(state_attenteconnexion);
		trans_connexionrecue.setTarget(state_attente);
		trans_connexionrecue.registerEvent("newConnection");
		trans_connexionrecue.registerAction(new PINGACTION());
		
		
		Transition trans_reponserecue = new Transition("ReponseRecue");
		trans_reponserecue.setSource(state_attente);
		trans_reponserecue.setTarget(state_fin);
		trans_reponserecue.registerEvent("pong");
		trans_reponserecue.registerAction(new PONGACTION());
		
		trans_reponserecue.registerAction(new DisconnectFromServerAction());
		
		

		fsm.addState(state_attenteconnexion);
		fsm.addState(state_attente);
		fsm.addState(state_fin);
		
		fsm.setInitialState(state_attenteconnexion);
		fsm.setFinalState(state_fin);
		
		fsm.start();
		
	}
}


