
import java.awt.Color;

public abstract class Vehicle {
	private String name;
	private Color color;
	private double weight;
	private Person owner;
	
	public Vehicle(String n, Color c, double w, Person o) {
		this.name = n;
		this.color = c;
		this.weight = w;
		this.owner = o;
	}
	
	public void transferOwnership(Person newOwner) {
		this.owner = newOwner;
	}
}
