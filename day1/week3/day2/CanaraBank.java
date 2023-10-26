package week3.day2;

public abstract class CanaraBank implements Payment
{
	public void cashOnDelivery() {
	System.out.println("this payment is only cash on delivery");
}
public void upiPayments() {
	System.out.println("this payment is only upi method");
}
public void cardPayments() {
	System.out.println("this payment is only through card");
}
public void internetBanking() {
	System.out.println("this payment is only through internet banking");
}
	public void recordPaymentDetails() {
		System.out.println("this is record payment details");
	}
}
