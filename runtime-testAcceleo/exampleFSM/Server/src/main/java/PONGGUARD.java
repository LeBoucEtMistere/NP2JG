package PongServer;

import fsm.Event;
import fsm.FSM;
import fsm.Guard;

// Start of user code imports

 // your imports

// End of user code

public class PONGGUARD extends Guard{

	@Override
	public boolean eval(FSM fsm, Event e) {
		// Start of user code for PongGuard contents

 		// TODO : Guard content
		return (int)e.getData("id") >= 2000;

 		// End of user code
	}

}
