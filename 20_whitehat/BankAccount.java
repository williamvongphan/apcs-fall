/**
	 Team NBJ, Jun Hong Wang, Brian K., Nada Hameed
	 APCS pd6
	 HW19 -- Mo Money Mo Problems ...MORE AWESOME
	 2021-10-18
	 
	 DISCO:
	 We found out how to use short to change the input from an integer to a short.
	 We also reviewed conditionals, and implemented them in our code.
	 
	 QCC:
	 Is there another way to incorporate the short instead of putting short inside parentheses in the argument of the method?
	 
	 Team NBJ's Latest and Greatest Q2 Response:
	 When we create a new instance of a class, we say new ClassName(), and since ClassName() has parentheses, it is a method.
	 We didn't define this method the code but Java includes it for us, which is why we can use it.
	 
	 Team NBJ's Latest and Greatest Q3 Response:
	 We can override the toString method by rewriting the toString method, and it will output a string representation of an object.
	 
**/

public class BankAccount {
	private String fullName = "";
	private String password = "";
	private short pin = 0;
	private int accNum = 0;
	private double accBal = 0;
	
	public String setName( String newName ) {
		fullName = newName;
		return fullName;
	}
	
	public String setPasswd( String newPasswd ) {
		password = newPasswd;
		return password;
	}
	
	public short setPin( short newPin ) {
		if (!(1000 <= newPin && newPin <= 9998)) {
			pin = 9999;
			System.out.println("Invalid pin number, pin number must be a 4 digit number from 1000 to 9998, 9999 is not a valid pin number.");
		}
		 
		pin = newPin;
		return pin;
	}

	public int setAcctNum( int newAcctNum ) {
		if (!(100000000 <= newAcctNum && newAcctNum <= 999999998)) {
			accNum = 999999999;
			System.out.println("Invalid account number, account number must be a 9 digit number from 100000000 to 999999998, 999999999 is not a valid account number.");
		}
		
		accNum = newAcctNum;
		return accNum;
	}

	public double setBalance( double newBalance ) {
		accBal = newBalance; 
		return accBal;
	}
	
	// -------------------------------------------------------------------------
	
	public void deposit( double depositAmount ) {
		accBal = accBal + depositAmount;
	}

	public String withdraw( double withdrawAmount ) {
		if (!(withdrawAmount < accBal)) {
			System.out.println("Invalid withdraw amount, withdraw amount higher than account balance.");
			return("");
		}
		accBal = accBal - withdrawAmount;
		String output = Double.toString(accBal);
		return(output);
	}
	 
	public boolean authenticate(int accnum, short accpin) {
	 if (accnum == accNum) {
			if (accpin == pin) {
				 return(true);
			} else {
				 return(false);
			}
	 } else {
			return(false);
	 }
	}
	 
	public String toString() {
		String retStr = "\nAccount info:\n=======================";
		retStr = retStr + "\nName: " + fullName;
		retStr = retStr + "\nPassword: " + password;
		retStr = retStr + "\nPIN: " + pin;
		retStr = retStr + "\nAccount Number: " + accNum;
		retStr = retStr + "\nBalance: " + accBal;
		retStr = retStr + "\n=======================";
		return retStr;
	}
	
	public static void main( String[] args ) {
		BankAccount acct1 = new BankAccount();
		
		acct1.setName("test name");
		acct1.setPasswd("testpassword");
		acct1.setPin((short)1234);
		acct1.setAcctNum(123456789);
		acct1.setBalance(100);

		if (acct1.authenticate(123456789, (short) 1234) == true) {
			acct1.deposit(99.99);
			acct1.withdraw(13.12);
			System.out.println(acct1.toString());
		} else {
			System.out.println("Invalid credentials");
		}
			 
		BankAccount acct2 = new BankAccount();
		
		acct2.setName("test name");
		acct2.setPasswd("testpassword");
		acct2.setPin((short)4321);
		acct2.setAcctNum(987654321);
		acct2.setBalance(500000000);
		 
		if (acct2.authenticate(987654321, (short) 4321) == true) {
			acct2.deposit(100000000);
			acct2.withdraw(13.12);
			System.out.println(acct2.toString());
		} else {
			System.out.println("Invalid credentials");
		}
	}
}