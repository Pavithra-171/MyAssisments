package week3.day1;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("Open the incognito");
	}
	public void clearCache() {
		System.out.println("Clear the all Cache");
	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();
	}
}
