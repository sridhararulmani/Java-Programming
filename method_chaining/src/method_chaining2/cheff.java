package method_chaining2;

public class cheff 
{
	String name="Sherin";
	void chf() 
	{
		cook ck=new cook();
		ck.kitchen();
		System.out.println("cheff's foods are amazing");
	}
	void chfname() 
	{
		System.out.println(this.name+" is the cheff");
	}
	public static void main(String [] args) 
	{
		cheff cf=new cheff();
		cf.chfname();
		cf.chf();
	}
}