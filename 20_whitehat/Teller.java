//TNPG: AwesomeName

/*
 *	{
 *		"teamName": "AwesomeName",
 *		"members": [
 *			"Sophia Eiden",
 *			"William Vongphanith"
 *		],
 *		"homework": {
 *			"date": "10/19/21",
 *			"name": "External Audit",
 *			"id": "HW20"
 *		},
 *		"effort": 125,
 *		"discoveries": [
 *			"We discovered that Java is significantly slower than we thought when creating objects,
 * 			not creating hundreds of millions of objects when it could process billions o
 *			calculations a second. We theorize that this could be because creating objects and 
 *			writing them to random-access memory takes longer than simply making a calculation 
 *			(125 μs to store 1MB of memory vs mere nanoseconds per calculation)","We expected to be 
 *			able to exploit private v. public discrepancies to hack, but for the most part, they 
 *			made their attributes private, so stress testing was all the hacking we could do", 
 *			"Java also protects against stress testing to a limit by limiting the individual method *			calls to usable limits. Doesn't mean we can't use loops!."
 *		],
 *		"qcc": [
 *			"We thought that authenticate should be a private method that other functions could 
 *			use."
 *		]
 *	}
 *	
 */
public class Teller{
	public static void main(String[] args){
		// init
		double aLargeNumber = 123456912312312312234569123123123123123123123123123234569123123123123123123123123123312312312312312312312312312312234569123123123123123123123123123234569123123123123123123123123123312312312312312312312313123123122345691222312312312312312312312312323456912312312312312312312312312331231231231231231231223.123123;

		//basic setup - not hacking here
		BankAccount ba = new BankAccount();
		ba.setName("Sophia Eiden");
		ba.setPasswd("herebapassword");
		ba.setPin((short) 9999);
		ba.setPin((short) 1423);
		ba.setAcctNum(1893);
		ba.setAcctNum(555555555);
		ba.setBalance((long) 37898);
		System.out.println(ba.toString());

		//breaking it now

		// p1n c24ck32! c24ck p1n5 w17h0u7 kn0w1n9 7h3 02191n41 p1n!
		// (pin cracker! crack pins without knowing the original pin!)
		// very 1337
		for(int i = 1000; i < 9999; i++){
		 	boolean a = ba.authenticate(555555555,(short)i);
			if (a) {
				System.out.println("got ur pin lol: " + i);
				break;
			}
		}

		// 0v32f10w 7h3 84nk w17h 50 much m0n3y 7h47 1f y0u 23m0v3 411 7h47 m0n3y 7h3y 57111 7h1nk 7h47 m0n3y 15 7h323!
		// (overflow the bank with so much money that if you remove all that money they still think that money is there!)

		// these are arbitrary numbers. they are really really random. they have no meaning.
		for (long i = 0; i < (long) 903422569; i++) {
			ba.deposit(aLargeNumber);
		}
		System.out.println(ba.toString());
		// now withdraw the money and notice how it still thinks that there is infinity money in the bank.
		for (long i = 0; i < 903422569; i++) {
			ba.withdraw(aLargeNumber);
		}
		System.out.println(ba.toString());

		// c245h 7h3 wh013 5y573m 8y m4k1n9 4 14293 num832 0f 84nk 4cc0un75!
		// (crash the whole system by making a large number of bank accounts!)
		for (int i = 0; i < 123456789; i++) {
			// create an abusively long name
			System.out.println("The system is now going to create a lot of BankAccounts, if your system hangs, please use CTRL+C (but then we have proven that we could break the bank)");
			new BankAccount().setName("filler " + aLargeNumber + " more filler " + aLargeNumber);
			System.out.println("The system somehow had so much memory and so much CPU that it could make all the BankAccounts.");
			for (int j = 100000000; j < 123456788; j++) {
				// ddos the system with more bank accounts!
				new BankAccount().setName("filler " + aLargeNumber + " more filler " + aLargeNumber);
			}
		}
	}
}