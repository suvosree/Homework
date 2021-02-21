package q2;

public class GreeterTester {

	public static void main(String[] args) {
		Greeter g = new Greeter("world");
		Greeter g2 = g.createQualifiedGreeter("beautiful");
		System.out.println(g2.name);
		
		
		System.out.println("******************************************");
		Greeter a = new Greeter("Mike");
		Greeter b = new Greeter("Alex");
		System.out.println("a.name: " + a.name);
		System.out.println("b.name: " + b.name);
		b.swapNames(a);
		System.out.println("*************After swaping****************");
		System.out.println("a.name: " + a.name);
		System.out.println("b.name: " + b.name);
	}

}
