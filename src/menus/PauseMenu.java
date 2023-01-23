package menus;

	import events.EventManager;
import events.GameEvents;
import main.Main;
import menu.Menu;
import restaurant.Restaurant;

public class PauseMenu extends Menu {
	
	public PauseMenu(Main main) {
		super();
		
		addMenu(new Menu() {
			@Override
			public void exit() {
			}
			@Override
			public void execute() {
				EventManager.getInstance().notifyGameEvents(GameEvents.GAME_UNPAUSE);
			}
		}.setSubtitle("Continue Business"));

		addMenu(new Menu() {
			@Override
			public void exit() {
			}
			@Override
			public void execute() {
				main.playUpgradeMenu();
			}
		}.setSubtitle("Upgrade Restaurant"));

		addMenu(new Menu() {

			@Override
			public void exit() {
				// TODO Auto-generated method stub

			}

			@Override
			public void execute() {
				// TODO Auto-generated method stub

			}
		}.setSubtitle("Close Business"));
		
		setShowExit(false);
	}
	
	@Override
	public void prePrintOpts() {
		Restaurant.getInstance("").printStats();
	}

	@Override
	public void execute() {
	}

	@Override
	public void exit() {
	}

}
