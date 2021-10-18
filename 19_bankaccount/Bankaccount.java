/**
 * William Vongphanith and Sophia Eiden
 * APCS pd0 HW18 -- building a more meaningful class
 * 2021-10-18
 * 
 * instance variables for storing... account holder's full name account password
 * 4-digit PIN 9-digit account number account balance
 * 
 * and methods for... setting each attribute printing out all of an account’s
 * info at once depositing money withdrawing money
 **/

public class Bankaccount {

	// instance variables
	private String name;
	private String passwd;
	private short pin;
	private int acctNum;
	private double balance;
	// ---------------------------------------------

	// mutators
	public String setName(String newName) {
		String oldName = name;
		name = newName;
		return oldName;
	}

	public String setPasswd(String newPasswd) {
		String oldPasswd = passwd;
		passwd = newPasswd;
		return oldPasswd;
	}

	/* Begin edits made to provided code */
	public short setPin(short newPin) {
		short oldPin = pin;
		if (!(newPin < 9999 && newPin > 999)) {
			pin = 9999;
			System.out.println("Your PIN you provided was invalid (not a 4 digit number), so we set it to 9999");
			return oldPin;
		}
		pin = newPin;
		return oldPin;
	}

	public int setAcctNum(int newAcctNum) {
		int oldAcctNum = acctNum;
		if (!(newAcctNum < 999999999 && newAcctNum > 99999999)) {
			acctNum = 999999999;
			System.out.println("Your account number you provided was invalid (not a 9 digit number), so we set it to 999999999");
			return oldAcctNum;
		}
		else {
			acctNum = newAcctNum;
			return oldAcctNum;
		}
	}
	/* End edits made to provided code */

	public double setBalance(double newBalance) {
		double oldBalance = balance;
		balance = newBalance;
		return oldBalance;
	}
	// ---------------------------------------------

	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}

	public void withdraw(double withdrawAmount) {
		balance = balance - withdrawAmount;
	}

	// overwritten toString()
	public String toString() {
		String retStr = "\nAccount info:\n=======================";
		retStr = retStr + "\nName: " + name;
		retStr = retStr + "\nPassword: " + passwd;
		retStr = retStr + "\nPIN: " + pin;
		retStr = retStr + "\nAccount Number: " + acctNum;
		retStr = retStr + "\nBalance: " + balance;
		retStr = retStr + "\n=======================";
		return retStr;
	}

	/* Begin edits to provided code */

	// Notice that we overloaded the function to take either a pin or a password. It's good that the pin and the password use different data types. 

	// The following function(s) should really be private, but are public for the testing purposes.
	public boolean checkAuth (short userPin) {
		if (userPin != pin) {
			return false;
		}
		else {
			return true;
		}
	}

	public boolean checkAuth (String userPasswd) {
		if (userPasswd != passwd) {
			return false;
		}
		else {
			return true;
		}
	}
	

	/* End edits to provided code */
	// main method for testing
	public static void main(String[] args) {
		// I started a checking account.
		Bankaccount ba = new Bankaccount();

		short pin = 2345;

		ba.setName("ThunderRedStar");
		ba.setPasswd("SecurePassw0rd");
		ba.setPin(pin);
		ba.setAcctNum(123456789);
		ba.setBalance(123456789.1023);

		ba.deposit(12345);
		System.out.println(ba.toString());
		ba.withdraw(12345);
		System.out.println(ba.toString());
	}

}// end class BankAccount
