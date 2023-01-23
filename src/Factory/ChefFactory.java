package Factory;

import entity.Chef;
import entity.Staff;

public class ChefFactory extends StaffFactory {

	@Override
	public Staff createStaff() {
		return new Chef();
	}

}
