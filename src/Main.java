import accounts.Account;
import accounts.CheckingAccount;

public class Main {
	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount(100, 0.042);
		account.status();
		account.deposit(20);
		account.status();
	}
}