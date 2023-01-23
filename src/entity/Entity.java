package entity;

import java.util.Vector;

import helper.StringHelper;
import states.PhaseManager;

public abstract class Entity {
	protected String name;
	protected PhaseManager phaseManager;
	
	private static Vector<String> nameList = new Vector<>();
	
	public Entity() {
		super();
		generateName();
		setPhaseManager();
	}
	
	public abstract void setPhaseManager();
	
	public void update() {
		phaseManager.update();
	}
	
	private void generateName() {
		String name;
		do {
			name = StringHelper.getInstance().genRandString(2);
		} while (!nameList.contains(name));
		this.name = name;
		nameList.add(name);
	}
}
