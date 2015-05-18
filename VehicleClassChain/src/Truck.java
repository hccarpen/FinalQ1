
import java.awt.Color;


public class Truck extends Vehicle implements vInterface {
	private int NumberOfAxels;
	
	public Truck(String n, Color c, double w, Person o, int x) {
		super(n,c,w,o);
		this.NumberOfAxels = x;
	}
}
