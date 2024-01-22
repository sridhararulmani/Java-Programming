package class3_meth2;

public class passanger {
	void tackTicket(String name){
		issue i=new issue();
		ticket tt=i.conductor(10);
		System.out.println(name);
	}
}