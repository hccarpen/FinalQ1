import static org.junit.Assert.*;

import java.awt.Color;
import java.util.HashMap;
import java.util.UUID;

public class Test {

	@org.junit.Test
	public void test() {
		Person a = new Person("John", "Smith");
		Car car = new Car("aCar", Color.BLACK, 4000.0, a, 4);
		Truck truck = new Truck("aTruck", Color.DARK_GRAY, 5000.0, a, 2);
		Person b = new Person("Jane", "Doe");
		truck.transferOwnership(b);
		MotorCycle mc = new MotorCycle("aMC", Color.RED, 850.0, b, false);
		HashMap<UUID,Object> sc = new HashMap<UUID,Object>();
		sc.put(UUID.randomUUID(), a);
		sc.put(UUID.randomUUID(), car);
		sc.put(UUID.randomUUID(), truck);
		sc.put(UUID.randomUUID(), b);
		sc.put(UUID.randomUUID(), mc);
		
		sc.size();
		sc.get(a);
		sc.get(car);
		sc.get(truck);
		sc.get(b);
		sc.get(mc);
	}

}
