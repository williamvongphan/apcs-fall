class Bankaccount {

	// Notes:
		/*
		 * I don't think you can change your account number, so there's no method for that.
		 * The constructor generates a random 9-digit account number for you.
		 * Implemented proper security protocol. All information is private. So you can't set it without using proper methods.
		 * Implemented print function because I'm simply not going to type System.out.println every time. 
		*/
	private String acct_name;
	private String acct_password;
	private int acct_pin; 
	private int acct_number;
	private double acct_balance;

	public void print (String text) {
		System.out.println(text);
	}

	public Bankaccount (String name, String password, int pin) {
		acct_name = name;
		acct_password = password;
		acct_pin = pin;
		acct_number = Utils.random_acct_number();
		acct_balance = 0;
	}

	public void set_account_name (String password, String name) {
		if (password != acct_password) {
			print("Invalid password.");
		}
		else {
			acct_name = name;
		}
	}

	public void set_account_password (String old_password, String new_password) {
		if (old_password != acct_password) {
			print("Invalid password.");
		}
		else {
			acct_password = new_password;
		}
	}

	public void set_account_pin (String password, int pin) {
		if (password != acct_password) {
			print("Invalid password.");
		}
		else {
			acct_pin = pin;
		}
	}

	public void print_info (String password) {
		if (password != acct_password) {
			print("Invalid password.");
		}
		else {
			print("===== BEGIN ACCOUNT INFO =====");
			print("Account Number: " + acct_number);
			print("Account Name: " + acct_name);
			print("Account Password: " + "*".repeat(acct_password.length()));
			print("Account PIN: " + "****");
			print("=====  END ACCOUNT INFO  =====");
		}
	}

	public void get_balance (int pin) {
		if (pin == acct_pin) {
			print("Your balance is: $" + acct_balance);
		}
		else {
			print("Invalid PIN.");
		}
	}

	public void deposit (int pin, double amount) {
		if (pin == acct_pin) {
			acct_balance += amount;
			print("You have deposited $" + amount + ".");
		}
		else {
			print("Invalid PIN.");
		}
	}

	public void withdraw (int pin, double amount) {
		if (pin == acct_pin) {
			acct_balance -= amount;
			print("You have withdrawn $" + amount + ".");
		}
		else {
			print("Invalid PIN.");
		}
	}
}
