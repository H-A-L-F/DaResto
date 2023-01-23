package events;

import java.util.HashMap;

public class EventManager {
	private HashMap<GameEvents, GameEventListener> gameEventListeners;
	
	private static EventManager instance;
	
	public EventManager() {
		super();
		this.gameEventListeners = new HashMap<>();
	}

	public static EventManager getInstance() {
		if(instance == null) instance = new EventManager();
		return instance;
	}
	
	public void subscribeGameEvent(GameEvents k, GameEventListener v) {
		this.gameEventListeners.put(k, v);
	}
	
	public void unsubscribeGameEvent(GameEvents k, GameEventListener v) {
		this.gameEventListeners.remove(k, v);
	}
	
	public void notifyGameEvents(GameEvents e) {
		gameEventListeners.get(e).respondGameEvent(e);
	}
}
