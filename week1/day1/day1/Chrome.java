package week1.day1;

public class Chrome {
	public static void main(String[] args) {
		Browser1 browser =new Browser1();
		browser.getName();
		browser.PrintName();
	}

}

class Browser1 {
	
	public void getName() { 
		System.out.println("This is google chrome");
	}
	public void PrintName() {
		System.out.println("This is google chrome1");
	}
}
