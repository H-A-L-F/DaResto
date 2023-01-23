package states;

import entity.Customer;

public class CustomerPhaseManager extends PhaseManager {
	
	private final Customer customer;

	public CustomerPhaseManager(Customer customer) {
		super(customer);
		this.customer = customer;
	}
	
	@Override
	protected void setInitPhase() {
		this.phase = new CustomerPhaseOrder();
	}

	public class CustomerPhaseOrder extends Phase {

		public CustomerPhaseOrder() {
			super(Phases.ORDER, customer);
			setActionDelay(2);
		}

		@Override
		public void action() {
			customer.incTolerance(-2);
		}
		
	}
}