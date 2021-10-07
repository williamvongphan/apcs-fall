/*
Team Dynastic Duo of Destiny {Fang, Ducky Cat, William, and CS50DDB}
APCS
HW 13 - Where do BigSibs Come From?
2021-10-07
*/

public class Bigsib {

	String message; 
	
	public Bigsib (String msg) {
		message = msg;
	}
	
	public void setHelloMsg(String msg) {
		message = msg; // set class attribute
	}

	public String greet(String person) {
		return message + " " + person; // return greetings. 
	}
}