package facade;

public class AccountNumberCheck {
	private int accountNumber = 12345678;
	
	public int getAccountNumber() { return accountNumber; }
	public boolean accountActive(int accountNumToCheck) { return accountNumToCheck == getAccountNumber(); }
}
