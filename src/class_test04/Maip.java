package class_test04;

public class Maip implements Runnable {
	int count=20;
	Object obj=new Object();
	public void run() {
		while(count>0) {
			synchronized (obj) {
				if(count==0) {
					break;
				}
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"卖出第"+count--+"张票");
			}	
		}
	}
}
