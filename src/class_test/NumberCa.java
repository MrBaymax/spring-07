package class_test;

public class NumberCa {

	public static void main(String[] args) {
		int a=45168;
		int ra=niShu(a);
		System.out.println("原数是"+a);
		System.out.println("逆数是"+ra);
		suiXianHua();
		float rs= Sum(10);
		System.out.println(rs);
	}
	//输入一个数值,输出它的逆数，即输入数值：2349，输出为9432
	public static int niShu(int a) {
		int wn=a/10000;
		int qn=a%10000/1000;
		int bn=a%1000/100;
		int sn=a%100/10;
		int gn=a%10;
		int ra=gn*10000+sn*1000+bn*100+qn*10+wn;
		return ra;
	}
//输出所有水仙花数   百位 十位 个位的立方和 等于原数本身
	public static void suiXianHua() {
		for(int i=100;i<1000;i++) {
			int bw=i/100;
			int sw=i%100/10;
			int gw=i%10;
			if(bw*bw*bw+sw*sw*sw+gw*gw*gw==i) {
				System.out.print(i+" ");
			}
		}
	}
	//求1/(2*3)+1/(3*4)+……+1/((n-1)*n)
	public static float Sum(float n) {
		float sum=0;
		for(float i=3;i<=n;i++) {
			sum+=1/((i-1)*i);
		}
		return sum;	
	}
}
