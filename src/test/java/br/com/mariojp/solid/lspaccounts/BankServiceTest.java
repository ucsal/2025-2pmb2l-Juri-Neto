package br.com.mariojp.solid.lspaccounts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {

	 @Test
	    void checkingAccountShouldAllowWithdrawal() {
	        CheckingAccount ca = new CheckingAccount();
	        ca.deposit(100);
	        BankService service = new BankService();
	        service.processWithdrawal(ca, 40);
	        assertEquals(60, ca.getBalance());
    }

    @Test
    void savingsAccountShouldNotAllowWithdrawal() {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(100);
        BankService service = new BankService();


        assertEquals(100, sa.getBalance());
    }
}