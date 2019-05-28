
package Client;

import java.util.logging.Level;

import fsm.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

import Client.ENVOIPING;
import fsm.DisconnectFromServerAction;
import Client.AFFICHAGEPONG;
import Client.TIMERTIMEOUT;

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
		state_attenteconnexion.onEnteredAction(new TIMERTIMEOUT());
		State state_attentepong = new State("AttentePong");
		State state_fin = new State("Fin");

		Transition trans_connexion = new Transition("connexion");
		trans_connexion.setSource(state_attenteconnexion);
		trans_connexion.setTarget(state_attentepong);
		trans_connexion.registerEvent("newConnection");
		trans_connexion.registerAction(new ENVOIPING());
		
		trans_connexion.registerGuard(new TJRSVRAI());
		
		Transition trans_endbytimeout = new Transition("endByTimeout");
		trans_endbytimeout.setSource(state_attenteconnexion);
		trans_endbytimeout.setTarget(state_fin);
		trans_endbytimeout.registerEvent("timeout");
		
		Transition trans_reponseenvoyee = new Transition("reponseEnvoyee");
		trans_reponseenvoyee.setSource(state_attentepong);
		trans_reponseenvoyee.setTarget(state_fin);
		trans_reponseenvoyee.registerEvent("pongRecu");
		trans_reponseenvoyee.registerAction(new DisconnectFromServerAction());
		
		trans_reponseenvoyee.registerAction(new AFFICHAGEPONG());
		
		

		fsm.addState(state_attenteconnexion);
		fsm.addState(state_attentepong);
		fsm.addState(state_fin);
		
		fsm.setInitialState(state_attenteconnexion);
		fsm.setFinalState(state_fin);
		
		fsm.start();
		
	}
}


