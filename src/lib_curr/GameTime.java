package lib_curr;

import javax.swing.Timer;

import events.EventManager;
import events.GameEvents;

public class GameTime {
	private Timer timer;
	public int secs;
	
	private EventManager eventManager;
	
	private static GameTime instance;

	private GameTime() {
		super();
		
		this.timer = new Timer(1000, e -> {
			secs++;
			eventManager.notifyGameEvents(GameEvents.UPDATE);
		});
		this.secs = 0;
		this.eventManager = EventManager.getInstance();
	}
	
	public static GameTime getInstance() {
		if(instance == null) instance = new GameTime();
		return instance;
	}
	
	public void start() {
		timer.start();
	}
	
	public void pause() {
		timer.stop();
	}
	
	public void restart() {
		secs = 0;
	}
	
}
