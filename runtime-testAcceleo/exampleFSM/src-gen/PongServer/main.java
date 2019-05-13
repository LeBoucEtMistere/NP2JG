
package PongServer;

import java.util.logging.Level;

import fsm.FSMServer;

import fsm.State;
import fsm.Transition;

import PongServer.TIMEOUTACTION;
import PongServer.PONGACTION;
import fsm.DisconnectClientAction;
import PongServer.PONGACTION2;

public class main {
	
	public static void main(String[] args) {

		FSMServer fsm = new FSMServer("PongServer", (dis, f) -> new NetworkMessageParser(dis, f), 50300, "serverpw");
		fsm.LOGGER.setLevel(Level.INFO);

		State state_attenteconnexion = new State("AttenteConnexion");
		State state_attente = new State("Attente");
		State state_end = new State("End");

		Transition trans_connexionrecue = new Transition("connexionRecue");
		trans_connexionrecue.setSource(AttenteConnexion);
		trans_connexionrecue.setTarget(Attente);
		trans_connexionrecue.registerEvent("newConnection");
		
		Transition trans_timeout = new Transition("timeout");
		trans_timeout.setSource(AttenteConnexion);
		trans_timeout.setTarget(End);
		trans_timeout.registerEvent("timeoutConnection");
		trans_timeout.registerAction(new TIMEOUTACTION());
		
		Transition trans_reception1 = new Transition("reception1");
		trans_reception1.setSource(Attente);
		trans_reception1.setTarget(AttenteConnexion);
		trans_reception1.registerEvent("ping");
		trans_reception1.registerAction(new PONGACTION());
		trans_reception1.registerAction(new DISCONNECTCLIENTACTION());
		trans_reception1.registerGuard(new PONGGUARD());
		
		Transition trans_reception2 = new Transition("reception2");
		trans_reception2.setSource(Attente);
		trans_reception2.setTarget(AttenteConnexion);
		trans_reception2.registerEvent("ping");
		trans_reception2.registerAction(new PONGACTION2());
		trans_reception2.registerAction(new DISCONNECTCLIENTACTION());
		

		fsm.addState(state_attenteconnexion);
		fsm.addState(state_attente);
		fsm.addState(state_end);
		
		fsm.setInitialState(state_attenteconnexion);
		fsm.setFinalState(state_attenteconnexion);
		
		fsm.start();
		
	}
}


