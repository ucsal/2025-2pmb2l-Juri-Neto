package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable{
    
	@Override
    public void withdraw(double amount) {
		
        if (amount <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        balance -= amount;
        
    }
}