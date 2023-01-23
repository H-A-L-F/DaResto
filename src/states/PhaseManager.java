package states;

import entity.Entity;

public abstract class PhaseManager {
	protected final Entity entity;
	protected Phase phase;
	
	public PhaseManager(Entity entity) {
		super();
		this.entity = entity;
		setInitPhase();
	}
	
	protected abstract void setInitPhase();
	
	public void update() {
		phase.update();
	}
	
	protected void switchPhase(Phase phase) {
		this.phase = phase;
	}
}
