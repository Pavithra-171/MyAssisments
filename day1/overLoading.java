package week3.day1;

public class overLoading {
public void reportStep(String msg , String status) {
	System.out.println("msg :"+ msg + "status: "+ status);
}
public void reportStep(String msg , String status ,boolean snap) {
	System.out.println("msg :"+ msg + "status: "+ status + "snap the vaue is:" + snap );
}
public static void main(String[] args) {
	overLoading ove = new overLoading();
	ove.reportStep("Need to Complete", "Completed");
	ove.reportStep("Need to Complete", "Completed", true);
}
}
