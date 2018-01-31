package class_test;
//冒泡排序(相邻两两比较)
public class Maopao {
	public static void main(String[] args) {
		int[] a= {10,65,20,2,74,90,84,15,27};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {//冒泡排序第一遍排序后最后一个数是最值（最大或最小），所以大的数往后放就是从小到大排序，小的数往后放就是从大到小
					int tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
			}
		}
		for(int ar:a) {
			System.out.print(ar+",");
		}
	}
}
