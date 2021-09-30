public class Greet{
    public static void main(String[] args){
    	greet("Foo");
		greet("Bar");
		greet("Baz");
		greet("fellow Java lover");
    }

	public static void greet(String name) {
		System.out.println("Why, hello there, " + name + ". How do you do?");
		return;
	}
}