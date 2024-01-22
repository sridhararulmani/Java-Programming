package programingAssesment11_9_23_Asses;

public class methodOverLoading {
	void makePayment() {
		System.out.println("pament via cash");
	}
	void makePayment(String UPI) {
		System.out.println("pament via UPI :"+UPI);
	}
	void makePayment(long creditCard,int cvv) {
		System.out.println("pament via creditCard: "+creditCard);
		System.out.println("pament via cvv: "+cvv);
	}
	void makePayment(int cvv,long creditCard) {
		System.out.println("pament via cvv: "+cvv);
		System.out.println("pament via creditCard: "+creditCard);
	}
	void makePayment(String otp,long debitCard) {
		System.out.println("pament via debitCard :"+debitCard);
		System.out.println("pament via otp :"+otp);
	}
	public static void main(String[] args) {
		methodOverLoading mov1=new methodOverLoading();
		mov1.makePayment();
		methodOverLoading mov2=new methodOverLoading();
		mov2.makePayment("@3657683%");
		methodOverLoading mov3=new methodOverLoading();
		mov3.makePayment(1783784674972l,8786);
		methodOverLoading mov4=new methodOverLoading();
		mov4.makePayment(77767,997565453556l);
		methodOverLoading mov5=new methodOverLoading();
		mov5.makePayment("@6576",98978674335l);
	}
}
