package class_test;
//由1、2、3、4这四个数能组成多少个三位数（不重复）
public class Nb {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int bw=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					int sw=arr[j];
					for(int k=0;k<arr.length;k++) {
						if(arr[i]!=arr[k]&&arr[j]!=arr[k]) {
							int gw=arr[k];
							int num=bw*100+sw*10+gw;
							System.out.println(num);
							count++;
						}
					}
				}				
			}
		}
		System.out.println("共"+count+"个数");
	}
}
