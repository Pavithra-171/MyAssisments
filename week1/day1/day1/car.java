package week1.day1;

public class car
{
	public static void main(String[] args) {
		bike tesla = new bike();
		tesla.applyBreak();
		tesla.soundHorn();
		
	}
	
}

class bike {
	public void applyBreak()
	{
		System.out.println("Applied break");
	}


	public void soundHorn()
	{
		System.out.println("sound horn");
	}

}


