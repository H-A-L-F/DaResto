package entity;

public class Waiter extends Entity implements Staff {
	private int speed;
	
	public Waiter() {
		super();
		this.speed = 0;
	}

	@Override
	public void setPhaseManager() {
		// TODO Auto-generated method stub
		
	}
}
