package practices1;

class firstPractises {
	String Brand;
	int price;
	int c=1;
	firstPractises(String b,int p){
		this.Brand=b;
		this.price=p;
		System.out.println("BRAND OF CAR "+c+" :"+b+" "+p);
		//System.out.println("PRICEA OF CAR "+c+" :"+p);
		System.out.println();
		c++;
	}
	public static void main(String[] args) {
		firstPractises fp1=new firstPractises("BMW",70000);
		firstPractises fp2=new firstPractises("AUDI",71000);
	}
}
