package states;

import entity.Entity;

public abstract class Phase {
	protected final Phases state;
	protected final Entity entity;
	
	protected int actionDelay;
	protected int actionCounter;
	
	public Phase(Phases state, Entity entity) {
		super();
		this.state = state;
		this.entity = entity;
		this.actionDelay = 0;
		this.actionCounter = 0;
	}
	
	public abstract void action();
	
	public void update() {
		actionCounter--;
		
		if(actionCounter <= 0) {
			action();
			actionCounter = actionDelay;
		}
	}

	protected void setActionDelay(int delay) {
		this.actionDelay = delay;
		this.actionCounter = actionDelay;
	}
}
