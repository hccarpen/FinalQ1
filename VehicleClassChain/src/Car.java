
import java.awt.Color;


public class Car extends Vehicle implements vInterface {
	private int NumberOfDoors;
	
	public Car(String n, Color c, double w, Person o, int x) {
		super(n,c,w,o);
		this.NumberOfDoors = x;
	}
}
