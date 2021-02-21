package q2;

/**
 * @author Suvosree Chatterjee
 */
public class Greeter {
	String name = "";

/**
 * Constructor to initialize name variable with value passed during object creation.
 * @param name is name of greeter.
 */
	Greeter(String name){
		this.name = name;
	}


/**
 * swapNames method swaps name of a Greeter object with value of name of another Greeter object which passed
 * on as argument of swapNames method.
 * @param other is a object of Greeter class
 */
	public void swapNames(Greeter other) {
		String holdName = this.name;
		this.name = other.name;
		other.name = holdName;
	}


/**
 * createQualifiedGreeter takes a String & create, returns a Greeter object.
 * Greeter object which is getting returned will have name = argument of createQualifiedGreeter " " name of the
 * original object.
 * @param qualifier is a qualifier String.
 * @return new Greeter object.
 */
	public Greeter createQualifiedGreeter(String qualifier) {
		Greeter newGreeterObj = new Greeter(name);
		newGreeterObj.name = qualifier + "  " + this.name;
		return newGreeterObj;
	}
	
}
