package this_project1;

public class person {
	void servFood() {
		System.out.println("Serve the nice hot food");
	}
	void eat() {
		washHand();
		washPlate();
		servFood();
		System.out.println("Eat the tastee food");
		washHand();
		washPlate();
		arrangePlates();
	}
	void washHand() {
		System.out.println("Wash hands");
	}
	void washPlate() {
		System.out.println("Wash the plate");
	}
	void arrangePlates() {
		System.out.println("Arrange the plates");
	}
	public static void main(String[] args) {
		person p1= new person();
		p1.eat();
	}
}
