package week1.day1;

public class Mobile {
	
	static void makeCall()
	{
		String mobileModel ="samsung s23";
		Float mobileWeight =3.67f;
		System.out.println("My Mobile Model is "+mobileModel);
		System.out.println("My Mobile Weight is "+mobileWeight);
	}
	
	static void sendMsg() {
		int mobileCost =45000;
		boolean FullCharged =true;
		System.out.println("My Mobile cost is "+mobileCost);
		System.out.println("My Mobile is FullyCharged");
		
	}
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println("This is my mobile");
		mob.makeCall();
		mob.sendMsg();
		
	}

}
