package week3.day1;

public class Edge extends Browser
{

	public void takeSnap() {
		System.out.println("Take the Snap");
	}
	public void clearCookies() {
		System.out.println("Clear all the Cookiesp");
	}
	public void closeBrowser() {
		System.out.println("Close the Overriding Browser");
	}
	public static void main(String[] args) {
		Edge e = new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.clearCookies();
		e.takeSnap();
	}

}
