package week3.day2;

public class Amazon extends CanaraBank{
	public static void main(String[] args) {
		Amazon amz = new Amazon();
		amz.cardPayments();
		amz.cashOnDelivery();
		amz.internetBanking();
		amz.upiPayments();
		amz.recordPaymentDetails();
	}
}
