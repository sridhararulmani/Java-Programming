package zomato;

public class deliveryBoy extends delivery{
	static void deliveryBoyLable(){
		System.out.println("I m the person to deliver you orderd food");
	}
	void delboy() {
		deliveryBoyLable();
		delivery d=new delivery();
		d.del();
		deliveryBoyLastLable();
	}
	static void deliveryBoyLastLable(){
		System.out.println("Enjoy the food");
		System.out.println("And give the ratings");
	}
}