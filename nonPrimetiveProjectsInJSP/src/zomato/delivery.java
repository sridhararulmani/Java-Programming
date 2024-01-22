package zomato;

public class delivery extends app{
	static void deliveryLable(){
		System.out.println("Your order ready");
		System.out.println("We delivery you fav food safely");
	}
	void del() {
		order book=new order();
		book.odr();
		book.odr2("parota");
		book.odr3("dosa");
		book.odr2("parota2");
		deliveryLable();
	}
}