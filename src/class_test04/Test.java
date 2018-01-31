package class_test04;

public class Test {

	public static void main(String[] args) {
		Runnable maipiao=new Maip();
		Thread t1=new Thread(maipiao);
		Thread t2 =new Thread(maipiao);
		t1.start();
		t2.start();
	}
}
