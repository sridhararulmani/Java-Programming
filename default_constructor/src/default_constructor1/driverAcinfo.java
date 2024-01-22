package default_constructor1;

public class driverAcinfo {
	void drive() {
		AccountInfo ainfo1=new AccountInfo("Sherin",987542144056l,200000.50);
		ainfo1.afo();
		AccountInfo ainfo2=new AccountInfo("Sridhar",9875523648947l,20000.50);
		ainfo2.afo();
	}
	public static void main(String[] args) {
		driverAcinfo d=new driverAcinfo();
		d.drive();
		}
	}
