package menus;

import lib.ValidInRange;
import main.Main;
import menu.Menu;

public class MainMenu extends Menu {
	public MainMenu(Main main) {
		super();

		addMenu(new Menu() {

			@Override
			public void exit() {
				// TODO Auto-generated method stub

			}

			@Override
			public void execute() {
				String name = getIn().getString("Input restaurant's name [5..20]: ", new ValidInRange(5, 20));
				main.gameMaster.initGame(name);
			}
		}.setSubtitle("Play New Restaurant"));

		addMenu(new Menu() {

			@Override
			public void exit() {
				// TODO Auto-generated method stub

			}

			@Override
			public void execute() {
				// TODO Auto-generated method stub

			}
		}.setSubtitle("Highscore"));
	}
	
	@Override
	public void prePlayMenu() {
		System.out.println("\r\n" + "██████╗░░█████╗░  ██████╗░███████╗░██████╗████████╗░█████╗░\r\n"
				+ "██╔══██╗██╔══██╗  ██╔══██╗██╔════╝██╔════╝╚══██╔══╝██╔══██╗\r\n"
				+ "██║░░██║███████║  ██████╔╝█████╗░░╚█████╗░░░░██║░░░██║░░██║\r\n"
				+ "██║░░██║██╔══██║  ██╔══██╗██╔══╝░░░╚═══██╗░░░██║░░░██║░░██║\r\n"
				+ "██████╔╝██║░░██║  ██║░░██║███████╗██████╔╝░░░██║░░░╚█████╔╝\r\n"
				+ "╚═════╝░╚═╝░░╚═╝  ╚═╝░░╚═╝╚══════╝╚═════╝░░░░╚═╝░░░░╚════╝░\r\n");
		getIn().pressEnter();
	}

	@Override
	public void execute() {
	}

	@Override
	public void exit() {
	}

}
