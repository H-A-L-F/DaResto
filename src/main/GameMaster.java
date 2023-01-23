package main;

import events.EventManager;
import events.GameEventListener;
import events.GameEvents;
import lib_curr.GameStates;
import lib_curr.GameTime;
import lib_curr.GameplayInput;
import restaurant.Restaurant;

public class GameMaster implements GameEventListener {
	private Main main;

	private GameTime gameTime;
	private GameplayInput in;
	private Restaurant restaurant;
	private EventManager eventManager;

	public GameStates gameState;

	public GameMaster(Main main) {
		super();
		this.main = main;
		this.restaurant = null;
		this.gameTime = GameTime.getInstance();
		this.in = new GameplayInput();
		this.eventManager = EventManager.getInstance();

		setupEvents();
	}

	@Override
	public void respondGameEvent(GameEvents e) {
		switch (e) {
		case GAME_PAUSE:
			pauseGame();
			break;
		case GAME_UNPAUSE:
			continueGame();
			break;
		case UPDATE:
			update();
			break;
		default:
			break;
		}
	}

	private void update() {
		if (gameState != GameStates.PLAYING) return;
		restaurant.update();
		
		restaurant.printHeader();
		restaurant.printStats();
		restaurant.printRestaurant();

		System.out.println("Press Enter to go to pause menu");
	}

	public void initGame(String name) {
		this.restaurant = Restaurant.getInstance(name);
		this.gameTime.start();
		this.in.start();
		this.gameState = GameStates.PLAYING;

		pauseGame();
	}

	private void setupEvents() {
		eventManager.subscribeGameEvent(GameEvents.GAME_PAUSE, this);
		eventManager.subscribeGameEvent(GameEvents.GAME_UNPAUSE, this);
		eventManager.subscribeGameEvent(GameEvents.UPDATE, this);
	}

	private void pauseGame() {
		gameTime.pause();
		in.pause();
		gameState = GameStates.PAUSE;
		main.playPauseMenu();
	}

	private void continueGame() {
		gameTime.start();
		in.resume();
		gameState = GameStates.PLAYING;
	}

}
