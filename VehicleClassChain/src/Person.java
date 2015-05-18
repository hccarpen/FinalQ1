
import java.util.UUID;


public class Person {
	private String firstName,
		lastName;
	private UUID PersonID;
	
	public Person(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		this.PersonID = UUID.randomUUID();
	}
	
	public void setFirstName(String n) {this.firstName = n;}
	public void setLastName(String n) {this.lastName = n;}
	public void setUUID() {this.PersonID = UUID.randomUUID();}
	
	public String getFirstName() {return this.firstName;}
	public String getLastName() {return this.lastName;}
	public UUID getUUID() {return this.PersonID;}
}
