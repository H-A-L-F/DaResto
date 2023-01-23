package entity;

import states.CustomerPhaseManager;

public class Customer extends Entity {
	
	private int tolerance;

	public Customer() {
		super();
		this.tolerance = 15;
	}

	@Override
	public void setPhaseManager() {
		this.phaseManager = new CustomerPhaseManager(this);
	}

	public int getTolerance() {
		return tolerance;
	}

	public void setTolerance(int tolerance) {
		this.tolerance = tolerance;
	}
	
	public int incTolerance(int amt) {
		return this.tolerance += amt;
	}

}
