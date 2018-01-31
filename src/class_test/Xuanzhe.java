package class_test;
//选择排序(先是第一个与后面依次比较，然后是第二个依次与后面比较.........)
public class Xuanzhe {
	public static void main(String[] args) {
		int[] a= {10,65,20,2,74,90,84,15,27};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {//选择排序第一遍排序后第一个数是最值（最大或最小），所以大的数往前放就是从大到小排序，小的数往前放就是从小到大
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k:a) {
			System.out.print(k+" ");
		}	
	}
}
