import accounts.Account;
import accounts.CheckingAccount;

public class Main {
	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount(100, 0.042, 700);
		System.out.println(account.getRewardPoints());
		if (account.purchase(18.63)) {
			System.out.println("Purchase successful");
		} else {
			System.out.println("Purchase failed");
		}
		System.out.println(account.getRewardPoints());



	}
}