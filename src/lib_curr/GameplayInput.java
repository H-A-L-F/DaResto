package lib_curr;

import java.util.Scanner;

import events.EventManager;
import events.GameEvents;
import helper.ControlledThread;

public class GameplayInput extends ControlledThread {
	
	private final Scanner in;
	
	private final EventManager eventManager;

	public GameplayInput() {
		super("Gameplay Input");
		this.in = new Scanner(System.in);
		this.eventManager = EventManager.getInstance();
	}

	@Override
	public void update() {
		String input = in.nextLine();
		eventManager.notifyGameEvents(GameEvents.GAME_PAUSE);
	}

}
