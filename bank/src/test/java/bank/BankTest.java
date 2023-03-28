package bank;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BankTest {

	@Test
	public void testBank() {

		Account account1 = new Account(1, 100, 0.1f);
		Account account2 = new Account(2, 200, 0.1f);
		Bank bank = new Bank(new ArrayList<>(List.of(account1, account2)));
		Account account3 = new Account(3, 300, 0.1f);
		bank.addAccount(account3);
		bank.transfer(account1, account2, 50);
		bank.showBalance();
		assertEquals(50, account1.getBalance());
	}
}