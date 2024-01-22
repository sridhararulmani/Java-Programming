package zomato;

public class menu extends zomatoapp{
	static void menuLable(){
		System.out.println("Cohoose your Favrot Foods");
	}
	void menuDetail(){
		zomatoapp app=new zomatoapp();
		menuLable();
		System.out.println("-----Menu & Food-----");
		app.menu1("Parota");
		app.menu2("Dosaa");
		app.menu3("Donate");
		app.menu4("Sanveg");
	}
}