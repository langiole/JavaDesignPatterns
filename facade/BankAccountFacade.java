package facade;

public class BankAccountFacade {
	private int accountNum;
	private int securityCode;
	
	AccountNumberCheck accountChecker;
	SecurityCodeCheck securityCodeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int accountNum, int securityCode) {
		this.accountNum = accountNum;
		this.securityCode = securityCode;
		
		bankWelcome = new WelcomeToBank();
		accountChecker = new AccountNumberCheck();
		securityCodeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}
	
	public int getAccountNumber() { return accountNum; }
	public int getSecurityCode() { return securityCode; }
	
	public void withdrawCash(double cashToGet) {
		if (accountChecker.accountActive(getAccountNumber()) 
				&& securityCodeChecker.isCodeCorrect(getSecurityCode()) 
				&& fundChecker.haveEnoughMoney(cashToGet)) {
			System.out.println("Transaction Complete\n");
		}
		else {
			System.out.println("Transaction Failed\n");
		}
	}
	
	public void depositCash(double cashToDeposit) {
		if (accountChecker.accountActive(getAccountNumber()) 
				&& securityCodeChecker.isCodeCorrect(getSecurityCode())) {
			fundChecker.makeDeposit(cashToDeposit);
		}
		else {
			System.out.println("Transaction Failed\n");
		}
	}
}
