package entity;

import java.util.Vector;

import Factory.ChefFactory;
import Factory.StaffFactory;
import Factory.WaiterFactory;
import events.GameEventListener;
import events.GameEvents;

public class EntityManager implements EntityMediator, GameEventListener {
	private Vector<Customer> customers;
	private Vector<Waiter> waiters;
	private Vector<Chef> chefs;
	
	private StaffFactory staffFactory;

	public EntityManager() {
		super();
		this.customers = new Vector<>();
		this.waiters = new Vector<>();
		this.chefs = new Vector<>();
	}
	
	public void update() {
		for (Customer customer : customers) customer.update();
		for (Waiter waiter : waiters) waiter.update();
		for (Chef chef : chefs) chef.update();
	}

	@Override
	public void notify(Entity entity, EntityAction action) {
		
	}

	@Override
	public void respondGameEvent(GameEvents e) {
		switch (e) {
		case GEN_CUSTOMER: {
			generateNewCustomer();
		}
		break;
		default: {
		}
		break;
		}
	}

	private void generateNewCustomer() {
		customers.add(new Customer());
	}
	
	public void generateNewChef(int amt) {
		this.staffFactory = new ChefFactory();
		for(int i = 0; i < amt; i++) chefs.add((Chef) staffFactory.createStaff());
	}
	
	public void generateNewWaiter(int amt) {
		this.staffFactory = new WaiterFactory();
		for(int i = 0; i < amt; i++) waiters.add((Waiter) staffFactory.createStaff());
	}
	
	public void printStatus() {
		
	}
}
