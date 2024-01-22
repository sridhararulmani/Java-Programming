package searchOptionPrograme1;

public class manager {
	public static void main(String[] args) {
		employeeDAO eDAO=new employeeDAO();
		employee detailsFile=eDAO.search(10);
		System.out.println("Object Addres :"+detailsFile);
		System.out.println("Employee id :"+detailsFile.id);
		System.out.println("Employee Name :"+detailsFile.name);
		System.out.println("Employee dept :"+detailsFile.dept);
		System.out.println("Employee salary :"+detailsFile.salary);
	}
}
