//Team "AwesomeName": Sophia Eiden, William Vongphanith
//APCS
//HW 18 - method implementation in practical function
//10-13-21
/*
DISCO
	- Private variables cannot be accessed outside of their class. You must access them through a method within the class.
	- If variables were public, you could access them from outside their class( i.e. as acct.accountName).
	- The assignment taught us to apply the concepts we learned in the pre-work and in class recently into a useful? class.
QCC
	- if an instance variable is private, but the method accessing the variable is public can u call the method from another class and access the variable?
		- and how semantic is the difference?
	- How do you truncate decimals so it displays in cents (i.e. $192.57 instead of 192.5728491923 or $928.50 instead of $928.5)?
Q2: How do you know BEFORE you wrote your own constructor, that Java provides one for you?
	We know that java provides us with a constructor because variables can be called without us initializing them ourselves - it is initalized as null, but initalized nonetheless
Q3: Describe a test to determine whether Java provides a mean of outputting a STRING REPRESENTATION of an OBJECT.
	Rather simply, one can run the method System.out.println(<<object_name>>.toString()). When I ran that on this code, it presented this: Bankaccount@4fccd51b. So yes, it does present a string representation of the object, but not one that is readily intelligible.
*/

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

		acct.print(acct.toString());


	}
}