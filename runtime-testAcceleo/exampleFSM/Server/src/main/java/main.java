
package PongServer;

import java.util.logging.Level;

import fsm.*;


import PongServer.TIMEOUTACTION;
import PongServer.PONGACTION;
import fsm.DisconnectClientAction;
import PongServer.PONGACTION2;

public class main {
	
	public static void main(String[] args) {

		FSMServer fsm = new FSMServer("PongServer", (dis, f) -> new PongServerNetworkMessageParser(dis, f), 50300, "serverpw");
		fsm.LOGGER.setLevel(Level.INFO);

		State state_attenteconnexion = new State("AttenteConnexion");
		state_attenteconnexion.onEnteredAction(new TIMEOUTACTION());
		State state_attente = new State("Attente");
		State state_end = new State("End");

		Transition trans_connexionrecue = new Transition("connexionRecue");
		trans_connexionrecue.setSource(state_attenteconnexion);
		trans_connexionrecue.setTarget(state_attente);
		trans_connexionrecue.registerEvent("newConnection");
		
		Transition trans_timeout = new Transition("timeout");
		trans_timeout.setSource(state_attenteconnexion);
		trans_timeout.setTarget(state_end);
		trans_timeout.registerEvent("timeoutConnection");
		
		Transition trans_reception1 = new Transition("reception1");
		trans_reception1.setSource(state_attente);
		trans_reception1.setTarget(state_attenteconnexion);
		trans_reception1.registerEvent("ping");
		trans_reception1.registerAction(new PONGACTION());
		
		trans_reception1.registerAction(new DisconnectClientAction());
		
		trans_reception1.registerGuard(new PONGGUARD());
		
		Transition trans_reception2 = new Transition("reception2");
		trans_reception2.setSource(state_attente);
		trans_reception2.setTarget(state_attenteconnexion);
		trans_reception2.registerEvent("ping");
		trans_reception2.registerAction(new PONGACTION2());
		
		trans_reception2.registerAction(new DisconnectClientAction());
		
		trans_reception2.registerGuard(new InverseGuard(new PONGGUARD()));
		

		fsm.addState(state_attenteconnexion);
		fsm.addState(state_attente);
		fsm.addState(state_end);
		
		fsm.setInitialState(state_attenteconnexion);
		fsm.setFinalState(state_end);
		
		fsm.start();
		
	}
}


