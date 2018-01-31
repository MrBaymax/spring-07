package class_test;
//	1~100的质数和
public class sum {
	public int method(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return 0;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=100;i++) {
			sum b=new sum();
			sum+=b.method(i);
		}
		System.out.print(sum);
		}
	}

