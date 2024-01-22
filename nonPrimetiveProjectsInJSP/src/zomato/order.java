package zomato;

public class order extends menu{
	static void orderLable(){
		System.out.println("We have only less Charge Dishes");
	}
	static String o2;
	void odr() {
		System.out.println("Order yours favoret Dish & Food");
		orderLable();
		menu mnu=new menu();
		mnu.menuDetail();
	}
	menu odr2(String o) {
		this.o2=o;
		menu mnu2=new menu();
		return mnu2;
	}
	menu odr3(String oo) {
		this.o2=oo;
		menu mnu3=new menu();
		return mnu3;
	}
}