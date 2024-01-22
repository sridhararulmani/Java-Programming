package method_chaining;

public class teacherTest {
	void teachtest() {
		teacher t=new teacher();
		t.teach();
		System.out.println("Studens will listen the class");
	}
	public static void main(String[] args) {
		teacherTest ts=new teacherTest();
		ts.teachtest();
	}
}