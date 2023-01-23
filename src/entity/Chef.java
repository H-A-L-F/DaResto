package entity;

public class Chef extends Entity implements Staff {
	private int speed;
	private int skill;
	
	public Chef() {
		super();
		this.speed = 0;
		this.skill = 0;
	}

	@Override
	public void setPhaseManager() {
		// TODO Auto-generated method stub
		
	}
}
