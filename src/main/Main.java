package main;

import menus.MainMenu;
import menus.PauseMenu;
import menus.UpgradeMenu;

public class Main {
	private MainMenu mainMenu;
	private PauseMenu pauseMenu;
	private UpgradeMenu upgradeMenu;
	
	public GameMaster gameMaster;

	public Main() {
		this.mainMenu = new MainMenu(this);
		this.pauseMenu = new PauseMenu(this);
		this.upgradeMenu = new UpgradeMenu(this);
		this.gameMaster = new GameMaster(this);
	}
	
	public void play() {
		mainMenu.playMenu();
	}
	
	public void playPauseMenu() {
		pauseMenu.playMenu();
	}
	
	public void playUpgradeMenu() {
		upgradeMenu.playMenu();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.play();
	}
}
