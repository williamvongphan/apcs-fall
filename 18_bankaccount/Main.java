class Main {
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
	}
}
