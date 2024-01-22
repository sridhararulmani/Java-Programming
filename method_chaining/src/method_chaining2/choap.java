package method_chaining2;

public class choap {
	String  type= "knife";
	void cutt() {
		wash w=new wash();
		w.clean();
		System.out.println("Cutt the vegetabels using "+this.type);
	}

}
