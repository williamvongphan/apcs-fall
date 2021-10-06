public class Bigsib {

    String message = "Hello";  // Default message before message is set
	// Class attribute, we learned this lmao
	
	public void setHelloMsg(String msg) {
		message = msg; // set class attribute
	}

	public String greet(String person) {
		return message + " " + person; // return greetings. 
	}
}