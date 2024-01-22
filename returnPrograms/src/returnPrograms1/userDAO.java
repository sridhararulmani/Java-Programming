package returnPrograms1;

public class userDAO {
	int count=1;
	boolean loginValidation(String name,String password){
		System.out.println("Connect to DB");
		System.out.println("exicute the SQL");
		if(this.count==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		userDAO user=new userDAO();
		boolean val=user.loginValidation("SRI","SHERIN");

		System.out.println( val);
		int x=user.add();
		//System.out.println(user.add());//both are possible
		System.out.println(x);
	}
	int add() {
		int a=5,b=4,c;
		c=a+b;
		return c;
	}
}