package returnPrograms1;

public class AccountDAO {
	double getBalance(){
		System.out.println("Connect to DB");
		System.out.println("cexicute SQL");
		double bal=25000;
		return bal;
	}
	public static void main(String[] args) {
		AccountDAO a=new AccountDAO();
		double b=a.getBalance();
		System.out.println("Balance :"+b);
	}
}