package returnPrograms1;

public class room {
	int num=2;
	String name1;
	String name2;
	
	String room201(String name1,String name2){
		this.name1=name1;
		this.name2=name2;
		System.out.println(name1+" "+name2);
 	if(System.out.printf("sunni boys ")==null) 
 	{
 		return "mei";
 	}
 	else {
 		return "vasi";
 	}
}
	public static void main(String[] args) {
		room r=new room();
		String koothi=r.room201("meiii","vasi");
		System.out.println("koothi is "+koothi);
	}
}
