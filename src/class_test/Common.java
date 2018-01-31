package class_test;
//最大公约数、最小公倍数
public class Common {
	public static void main(String[] args) {
		int a=18;
		int b=30;
		int cmin;
		if(a>b) {
			cmin=getCmin(b,a);
		}else {
			cmin=getCmin(a,b);
		}
		//最小公倍数
		int cmax=a*b/cmin;
		System.out.println("最大公约数:"+cmin);
		System.out.println("最小公倍数:"+cmax);
	}
	public static int getCmin(int min,int max) {
		for(int i=min;i>=1;i--) {
			if(min%i==0&&max%i==0) {
				return i;
			}
		}
		return 0;
	}
}
