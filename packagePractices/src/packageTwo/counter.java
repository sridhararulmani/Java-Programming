package packageTwo;
import packageOne.hottel;
public class counter {
	public static void main(String[] args) {
		//hottel h=new hottel();
		hottel.menu("parota", "dosa", "idily");
		System.out.println("Item one :"+hottel.item1);
		System.out.println("Item two :"+hottel.item2);
	//	System.out.println(hottel.item3);
		hottel h=new hottel();
		int res=h.math(30,40);
		System.out.println("Bill :"+res);
	}
}