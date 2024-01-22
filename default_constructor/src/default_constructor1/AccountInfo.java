package default_constructor1;

public class AccountInfo {
	String name;
	long accountNo;
	double balance;
	public AccountInfo(String n,long ano,double bal){
		this.name=n;
		this.accountNo=ano;
		this.balance=bal;
	}
	void afo() {
		System.out.println("SBI");
		System.out.println("Details of the Account");
		System.out.println("Name of the Accountant  :"+this.name);
		System.out.println("Account Number  :"+this.accountNo);
		System.out.println("Balance from the Account  :"+this.balance);
		System.out.println("Thanking you for Banking with us....");
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
	}
}
