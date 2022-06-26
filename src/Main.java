import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Main {
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(100, 0.037, 500);
		SavingsAccount sa = new SavingsAccount(100, 0.045);

		ca.status();
		sa.status();
		ca.withdraw(10);
		sa.withdraw(10);
		ca.status();
		sa.status();



	}
}