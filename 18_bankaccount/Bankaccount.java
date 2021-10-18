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

	public static void main(String[] args) {
		// I started a checking account.
		Bankaccount acct = new Bankaccount("ThunderRedStar", "SecurePassword123", 1234);

		// I deposited some money and used it as normal.
		acct.get_balance(1234);
		acct.deposit(1234, 5000);
		acct.get_balance(1234);
		acct.withdraw(1234, 1000);
		acct.get_balance(1234);

		// Oh no, some random hacker stole my account number and wants to steal my money! And he is trying to steal my data too!
		acct.withdraw(5678, 4000);
		acct.print_info("WrongPassword123");
		acct.set_account_password("WrongPassword123", "InsecurePassword123");

		// Thank god for my pin and password! And these methods!
		acct.set_account_password("SecurePassword123", "MoreSecurePassword123!?");

		// As you can see here, the password change takes effect.
		acct.set_account_pin("SecurePassword123", 9876);

		// Actual PIN change.
		acct.set_account_pin("MoreSecurePassword123!?", 9876);

		// More "normal" account usage
		acct.deposit(9876, 6000);
		acct.get_balance(9876);
		acct.print_info("MoreSecurePassword123!?");

		acct.print(acct.toString());


	}
}
