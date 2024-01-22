package projectOneUsingStream;

public class Student {
	int id;
	String name;
	double per;
	String depot;
	Student(int id,String name,double per,String depot){
		this.id=id;
		this.name=name;
		this.per=per;
		this.depot=depot;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPer() {
		return per;
	}
	@Override
	public String toString() {
		return "ID :"+id+" Name :"+name+" Per :"+per+" Deportment :"+depot;
	}
}