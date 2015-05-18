
import java.awt.Color;


public class MotorCycle  extends Vehicle implements vInterface {
	private boolean hasSideCar;
	
	public MotorCycle(String n, Color c, double w, Person o, boolean i) {
		super(n,c,w,o);
		this.hasSideCar = i;
	}
}
