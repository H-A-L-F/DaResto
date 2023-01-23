package Factory;

import entity.Staff;
import entity.Waiter;

public class WaiterFactory extends StaffFactory {

	@Override
	public Staff createStaff() {
		return new Waiter();
	}

}
