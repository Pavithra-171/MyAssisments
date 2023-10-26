package week3.day1;



public class safari extends Browser
{
	public void readerMode() {
		System.out.println("Change to reader mode");
	}
	public void fullScreenMode() {
		System.out.println("Chage to full screen mode");
	}
	public static void main(String[] args) {
		safari s = new safari();
		s.openURL();
		s.readerMode();
		s.fullScreenMode();
		s.closeBrowser();
		s.navigateBack();
	}
	
}
