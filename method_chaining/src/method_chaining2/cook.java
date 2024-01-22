package method_chaining2;

public class cook {
	String type="Stow";
	void kitchen() {
		choap c=new choap();
		c.cutt();
		System.out.println("Cook the vegs using "+this.type);
	}
}
