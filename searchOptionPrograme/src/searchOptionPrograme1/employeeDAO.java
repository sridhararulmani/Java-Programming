package searchOptionPrograme1;

public class employeeDAO {
	employee search(int id){
		System.out.println("Connected to the Data Base");
		System.out.println("Exicuted the SQL Query");
		employee e=new employee();
		e.id=id;
		e.name="sri";
		e.salary=100;
		e.dept="Hr";
		return e;
	}
}
