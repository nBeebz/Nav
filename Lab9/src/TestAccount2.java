import java.util.Scanner;


public class TestAccount2 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Account acct1, acct2, acct3, acct4;
		System.out.println("Enter in the first account name");
		acct1 = new Account(100, scan.nextLine());
		System.out.println("Enter in the second account name");
		acct2 = new Account(100, scan.nextLine());
		System.out.println("Enter in the third account name");
		acct3 = new Account(100, scan.nextLine());
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
		acct1.close();
		acct4 = Account.consolodate(acct2, acct3);
		System.out.println(acct4);
		scan.close();
	}
}
