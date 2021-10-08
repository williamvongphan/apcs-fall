public class Bigsib {

	String message; 
	
	public Bigsib (String msg) {
		message = msg;
	}

	public Bigsib () {
		message = "Hello";
	}
	
	public void setHelloMsg(String msg) {
		message = msg; // set class attribute
	}

	public String greet(String person) {
		return message + " " + person; // return greetings. 
	}
}
